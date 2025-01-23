package PaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;

public class CardInstrumentService extends InstrumentService {

    private static CardInstrumentService instance = null;

    public static CardInstrumentService getInstance() {
        if (instance == null) {
            instance = new CardInstrumentService();
        }
        return instance;
    }

    @Override
    public void addInstrument(InstrumentDO instrument) {
        CardInstrument cardInstrument = new CardInstrument();
        cardInstrument.setInstrumentId(instrument.getInstrumentId());
        cardInstrument.setUserId(instrument.getUserId());
        cardInstrument.setInstrumentType(instrument.getInstrumentType());
        cardInstrument.setCardNumber(instrument.getCardNumber());
        cardInstrument.setExpiryDate(instrument.getExpiryDate());
        cardInstrument.setCvv(instrument.getCvv());

        if (userInstrumentMap.containsKey(instrument.getUserId())) {
            userInstrumentMap.get(instrument.getUserId()).add(cardInstrument);
        } else {
            List<Instrument> instruments = new ArrayList<Instrument>();
            instruments.add(cardInstrument);
            userInstrumentMap.put(instrument.getUserId(), instruments);
        }
    }

    private InstrumentDO convertToInstrumentDO(CardInstrument cardInstrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.setInstrumentId(cardInstrument.getInstrumentId());
        instrumentDO.setUserId(cardInstrument.getUserId());
        instrumentDO.setInstrumentType(cardInstrument.getInstrumentType());
        instrumentDO.setCardNumber(cardInstrument.getCardNumber());
        instrumentDO.setExpiryDate(cardInstrument.getExpiryDate());
        instrumentDO.setCvv(cardInstrument.getCvv());
        return instrumentDO;
    }

    @Override
    public List<InstrumentDO> getInstrumentsByUserId(String userId) {

        if (userInstrumentMap.containsKey(userId)) {
            List<InstrumentDO> instruments = new ArrayList<InstrumentDO>();
            for (Instrument instrument : userInstrumentMap.get(userId)) {
                if (instrument.getInstrumentType().equals(InstrumentType.CARD)) {
                    instruments.add(convertToInstrumentDO((CardInstrument) instrument));
                }
            }
            return instruments;
        }
        return null;
    }
}
