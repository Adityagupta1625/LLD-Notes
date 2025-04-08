package Cache;

import Cache.Policy.EvictionPolicy;
import Cache.Policy.LRUEvictionPolicy;
import Cache.Storage.HashmapBasedStorage;
import Cache.Storage.Storage;

public class Main {

    private static int CACHE_SIZE = 5;

    public static void main(String[] args) {

        Storage<Integer, String> storage = new HashmapBasedStorage<Integer, String>(CACHE_SIZE);

        EvictionPolicy<Integer> evictionPolicy = new LRUEvictionPolicy<Integer>();

        Cache<Integer, String> cache = new Cache<Integer, String>(evictionPolicy, storage);

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        cache.put(4, "Four");
        cache.put(1, "One");
        cache.put(5, "Five");
        cache.put(6, "Six");
        cache.put(7, "Seven");

        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
        // System.out.println(cache.get(5));
        // System.out.println(cache.get(6));
        // System.out.println(cache.get(7));
        // System.out.println(cache.get(8));
    }
}
