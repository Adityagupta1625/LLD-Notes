package Cache.Storage;

import java.util.HashMap;
import java.util.Map;

import Cache.Exception.NotFoundException;
import Cache.Exception.StorageFullException;

public class HashmapBasedStorage<Key, Value> implements Storage<Key, Value> {

    private final Map<Key, Value> storage;
    private final int capacity;

    public HashmapBasedStorage(int capacity) {
        this.capacity = capacity;
        this.storage = new HashMap<Key, Value>(capacity);
    }

    @Override
    public void put(Key key, Value value) throws StorageFullException {
        if (storage.size() == capacity) {
            throw new StorageFullException("Storage is full");
        }
        storage.put(key, value);
    }

    @Override
    public Value get(Key key) {
        if (!storage.containsKey(key)) {
            throw new NotFoundException("Key not found");
        }
        return storage.get(key);
    }

    @Override
    public void remove(Key key) {
        if (!storage.containsKey(key)) {
            throw new NotFoundException("Key not found");
        }
        storage.remove(key);
    }

    @Override
    public boolean isFull() {
        return storage.size() == capacity;
    }
}
