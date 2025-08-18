package JavaMOOCI.part7.Exercise2;

import java.util.Arrays;

// Implementing a sorting algorithm from scratch
public class SortingProgram {
    
        public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        SortingProgram.sort(array);
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        // int smallest = array[0];
        // int index = 0;
        // for(int i = 0; i < array.length; i++){
        //     if (array[i] < smallest){
        //         smallest = array[i];
        //         index = i;
        //     }
        // }
        // return index;
        // The above was refactored after creating the method below, indexOfSmallestFrom
        return indexOfSmallestFrom(array, 0);
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < table.length; i++){
            if (table[i] < smallest){
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int swappingContainer = array[index1];
        array[index1] = array[index2];
        array[index2] = swappingContainer;
    }

    // All the methods above will fall into place when creating the following method, sort.
    // The following method sort will result in a type of algorithm called 'selection sort'
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            int smallestIntIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIntIndex);
            System.out.println(Arrays.toString(array));
        }

    }

}
