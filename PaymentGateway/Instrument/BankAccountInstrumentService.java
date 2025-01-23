package PaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;

public class BankAccountInstrumentService extends InstrumentService {

    private static BankAccountInstrumentService instance = null;

    public static BankAccountInstrumentService getInstance() {
        if (instance == null) {
            instance = new BankAccountInstrumentService();
        }
        return instance;
    }

    @Override
    public void addInstrument(InstrumentDO instrument) {
        BankAccountInstrument bankAccountInstrument = new BankAccountInstrument();
        bankAccountInstrument.setInstrumentId(instrument.getInstrumentId());
        bankAccountInstrument.setUserId(instrument.getUserId());
        bankAccountInstrument.setInstrumentType(instrument.getInstrumentType());
        bankAccountInstrument.setAccountNumber(instrument.getAccountNumber());
        bankAccountInstrument.setIfsc(instrument.getIfsc());

        if (userInstrumentMap.containsKey(instrument.getUserId())) {
            userInstrumentMap.get(instrument.getUserId()).add(bankAccountInstrument);
        } else {
            List<Instrument> instruments = new ArrayList<Instrument>();
            instruments.add(bankAccountInstrument);
            userInstrumentMap.put(instrument.getUserId(), instruments);
        }
    }

    private InstrumentDO convertToInstrumentDO(BankAccountInstrument bankAccountInstrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.setInstrumentId(bankAccountInstrument.getInstrumentId());
        instrumentDO.setUserId(bankAccountInstrument.getUserId());
        instrumentDO.setInstrumentType(bankAccountInstrument.getInstrumentType());
        instrumentDO.setAccountNumber(bankAccountInstrument.getAccountNumber());
        instrumentDO.setIfsc(bankAccountInstrument.getIfsc());
        return instrumentDO;
    }

    @Override
    public List<InstrumentDO> getInstrumentsByUserId(String userId) {

        if (userInstrumentMap.containsKey(userId)) {
            List<InstrumentDO> instruments = new ArrayList<InstrumentDO>();
            for (Instrument instrument : userInstrumentMap.get(userId)) {
                if (instrument.getInstrumentType().equals(InstrumentType.BANK_ACCOUNT)) {
                    instruments.add(convertToInstrumentDO((BankAccountInstrument) instrument));
                }
            }
            return instruments;
        }
        return null;
    }
}
