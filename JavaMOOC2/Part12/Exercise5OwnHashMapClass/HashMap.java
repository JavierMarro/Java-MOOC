package JavaMOOC2.Part12.Exercise5OwnHashMapClass;

import java.util.ArrayList;

// This is the answer to a problem set, however the code is taken from the notes provided by UoH
public class HashMap<K, V> {
    
    private ArrayList<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new ArrayList[32]; // A hashmap knows the number of values, just as done previously with class List
        this.firstFreeIndex = 0;
    }

    // method get used to search for a value based on a key
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        ArrayList<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }

        return null;
    }

    // These four methods down below are all needed one way or another for the functionality of the method add 

    // when copying, the location of each key-value pair is recalculated for the new array
    //to distribute all the key-value pairs in that array as evenly as possible
    private void copy(ArrayList<Pair<K, V>>[] newArray, int fromIdx) {
        ArrayList<Pair<K, V>> underList = values[fromIdx];
        for (int i = 0; i < firstFreeIndex; i++) {
            Pair<K, V> value = underList.get(i);
            if(value == null) continue;

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if(newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(value);
        }
    }
    //creates a new array whose size is double that of the old array
    private void grow() {
        // create a new array
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            ArrayList<Pair<K, V>> underList = values[i];
            if(underList == null) continue;
            // copy the values of the old array into the new one
            copy(newArray, i);
        }

        // replace the old array with the new
        this.values = newArray;
    }

    // responsible for finding the list related to the key
    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }

        return values[hashValue];
    }
    //responsible for finding the key on that list.
    private int getIndexOfKey(ArrayList<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }
    // methods above used for final version of add
    public void add(K key, V value) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        //to grow the size of the hash map if the number of key-value pairs in it is greater than 75% of the size of the internal array
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}

// Method add is quite complex, so the version below is broken down into getListBasedOnKey and getIndexOfKey and refactored
// public void add(K key, V value) {
//     //first calculate the hash value for the key and use it to determine the suitable index in the internal array
//     int hashValue = Math.abs(key.hashCode() % values.length);
//     if (values[hashValue] == null) {
//         values[hashValue] = new List<>(); // If there is no value in that index, we create a list into that index
//     }

//     List<Pair<K, V>> valuesAtIndex = values[hashValue];

//     int index = -1;
//     for (int i = 0; i < valuesAtIndex.size(); i++) {
//         if (valuesAtIndex.value(i).getKey().equals(key)) {
//             index = i; 
//             break;
//         }
//     }

//     if (index < 0) {
//         valuesAtIndex.add(new Pair<>(key, value)); // Otherwise the method adds a new key-value pair in the list
//         this.firstFreeIndex++;
//     } else {
//         valuesAtIndex.value(index).setValue(value); // If the matching key is found, the value related to it is updated to match the new value
//     }
// }
