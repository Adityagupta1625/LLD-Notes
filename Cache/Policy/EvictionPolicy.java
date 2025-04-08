package Cache.Policy;

public interface EvictionPolicy<Key> {

    Key evict();

    void keyAccessed(Key key);
}
