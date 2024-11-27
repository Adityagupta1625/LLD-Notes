package InterpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, Integer> contextMap = new HashMap<>();

    public void set(String key, Integer value) {
        contextMap.put(key, value);
    }

    public Integer get(String key) {
        return contextMap.get(key);
    }
}
