package PaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;

public class InstrumentController {

    private InstrumentServiceFactory instrumentServiceFactory;

    public InstrumentController() {
        instrumentServiceFactory = new InstrumentServiceFactory();
    }

    public void addInstrument(InstrumentDO instrument) {
        InstrumentService instrumentService = instrumentServiceFactory.getService(instrument.getInstrumentType());
        instrumentService.addInstrument(instrument);

    }

    public List<InstrumentDO> getInstrumentsByUserId(String userId) {
        InstrumentService instrumentService = instrumentServiceFactory.getService(InstrumentType.CARD);

        List<InstrumentDO> cards = instrumentService.getInstrumentsByUserId(userId);

        instrumentService = instrumentServiceFactory.getService(InstrumentType.BANK_ACCOUNT);

        List<InstrumentDO> bankAccounts = instrumentService.getInstrumentsByUserId(userId);

        List<InstrumentDO> instruments = new ArrayList<InstrumentDO>();

        if (cards != null)
            instruments.addAll(cards);

        if (bankAccounts != null)
            instruments.addAll(bankAccounts);

        return instruments;
    }
}
