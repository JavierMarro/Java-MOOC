package JavaMOOC2.Part12.Exercise5OwnHashMapClass;

// This class represents a key-value pair
// This is the answer to a problem set, however the code is taken from the notes provided by UoH
public class Pair<K, V> {
    // The fields with generic types K and V are named so after the words 'key' and 'value'
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

