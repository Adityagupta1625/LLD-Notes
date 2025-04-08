package Cache.Storage;

import Cache.Exception.NotFoundException;
import Cache.Exception.StorageFullException;

public interface Storage<Key, Value> {
    public void put(Key key, Value value) throws StorageFullException;

    public Value get(Key key) throws NotFoundException;

    public void remove(Key key) throws NotFoundException;

    public boolean isFull();
}
