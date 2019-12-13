package hashtable;

import java.util.Arrays;

public class BasicHashTable<K, V> {

    public static void main(String[] args) {
        BasicHashTable basicHashTable = new BasicHashTable(10);
        basicHashTable.put("One", 1);
        basicHashTable.put("two ", 2);

        System.out.println(basicHashTable.get("two"));
    }

    Entry<K, V>[] data;
    int capacity;
    private int size;

    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        data = new Entry[capacity];
        this.size = 0;
    }

    public V get(K key) {
        int hashCode = getHashCode(key);
        if (data[hashCode] == null) {
            return null;
        } else {
            return data[hashCode].getValue();
        }
    }

    public void put(K k, V v) {
        Entry entry = new Entry(k, v);
        int hashcode = getHashCode(k);
        data[hashcode] = entry;
    }

    public int getSize() {
        return size;
    }

    public int getHashCode(K k) {
        int hash = k.hashCode() % capacity;
        while (data[hash] != null && !data[hash].getKey().equals(k)) {
            hash = hash + 1;
        }
        return hash;
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
