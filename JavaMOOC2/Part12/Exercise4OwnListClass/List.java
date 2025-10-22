package JavaMOOC2.Part12.Exercise4OwnListClass;

// This is the answer to a problem set, however the code is taken from the notes provided by UoH
public class List<T> {

    private T[] values; //The List has a generic array — the type of the elements in the array is defined on run time using type parameters
    private int freeIndex; //int variable to keep track of the first empty index in the array.

    public List(){
        this.values = (T[]) new Object[10]; // The array is created as type object and changed to type generic
        this.freeIndex = 0; // setting the first free index in the array at 0
    }

    // It's bound to happen that the user will run out of space. This method creates a new array whose size is 1.5 times the size of the old array. 
    // After this all the elements of the old array are copied into the new one, and finally the value of the object variable values is set to the new array. 
    // The automatic Java garbage collector removes the old array at some point, now that there are no longer any references to it
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        T[] newValues = (T[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    public void add(T value) {
        if(this.freeIndex == this.values.length) {
            grow();
        }

        this.values[this.freeIndex] = value; // setting the i of the value added to whatever is the current index (starting from 0)
        this.freeIndex++; // same as this.firstFreeIndex = this.firstFreeIndex + 1;
    }

    // Checks whether the List contains a value or not. 
    // Java objects — no matter its type — inherits the Object class (or is type Object). 
    // Due to this, each object has the method public boolean equals(Object object), which we can use to check equality.
    public boolean contains(T value) {
        for (int i = 0; i < this.freeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    // for the method remove() we need to split the functionality into two methods:
    // indexOfValue searches for the index of the given value. The method returns -1 if the value is not found
    public int indexOfValue(T value) {
        for (int i = 0; i < this.freeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // Moves values from the given index one place to the left
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.freeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    //remove now can be implemented
    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.freeIndex--;
    }

    //Implementing the method size
    public int size(){
        return this.freeIndex;
    }

    // Method to search from index entered by user
    public T value(int index) {
        if (index < 0 || index >= this.freeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.freeIndex + "]");
        }

        return this.values[index];
    }
}

