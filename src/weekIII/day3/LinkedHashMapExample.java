package weekIII.day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Map<String, String> lru = new LruCache<>(16,0.75f,true);
       lru.put("a","A");
       lru.put("b","B");
       lru.put("c","C");
        lru.get("a");
        lru.get("a");
        lru.get("a");
        System.out.println(lru);

        System.out.println(lru.get("b"));
        lru.put("d","D");
        lru.put("e","D");

        // here c is the last used so it will be removed
        System.out.println(lru);
    }
    static class LruCache<K, V> extends LinkedHashMap<K, V> {
        private static final int MAX_ENTRIES = 4;

        public LruCache(int initialCapacity, float loadFactor, boolean accessOrder) {
            super(initialCapacity, loadFactor, accessOrder);
        }

        @Override//invokedd by put and putall method after inserting new entries into map
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > MAX_ENTRIES;
            // return false same as hashmap
        }
    }

    }


