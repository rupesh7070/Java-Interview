package hashtable;

public class BasicHashTable<K, V> {
    Entry[] data;
    int capacity;

    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        data = new Entry[capacity];
    }

    public void put(K k, V v) {
        Entry entry = new Entry(k, v);
    }

    private class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
