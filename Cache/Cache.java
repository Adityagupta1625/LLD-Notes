package Cache;

import Cache.Policy.EvictionPolicy;
import Cache.Storage.Storage;

public class Cache<Key, Value> {

    private Storage<Key, Value> storage;
    private EvictionPolicy<Key> evictionPolicy;

    public Cache(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage) {
        this.evictionPolicy = evictionPolicy;
        this.storage = storage;
    }

    public void put(Key key, Value value) {
        try {
            if (storage.isFull()) {
                Key keyToBeRemoved = evictionPolicy.evict();
                storage.remove(keyToBeRemoved);
            }

            storage.put(key, value);
            evictionPolicy.keyAccessed(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Value get(Key key) {
        try {

            return storage.get(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
