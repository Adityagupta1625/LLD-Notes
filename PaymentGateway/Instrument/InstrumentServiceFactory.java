package PaymentGateway.Instrument;

public class InstrumentServiceFactory {

    public InstrumentService getService(InstrumentType instrumentType) {
        if (instrumentType.equals(InstrumentType.CARD)) {
            return CardInstrumentService.getInstance();
        } else if (instrumentType.equals(InstrumentType.BANK_ACCOUNT)) {
            return BankAccountInstrumentService.getInstance();
        }
        return null;
    }
}
