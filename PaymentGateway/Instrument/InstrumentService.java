package PaymentGateway.Instrument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentService {

    static Map<String, List<Instrument>> userInstrumentMap = new HashMap<>();

    public abstract void addInstrument(InstrumentDO instrument);

    public abstract List<InstrumentDO> getInstrumentsByUserId(String userId);

}
