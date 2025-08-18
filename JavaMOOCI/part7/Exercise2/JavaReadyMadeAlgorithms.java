package JavaMOOCI.part7.Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaReadyMadeAlgorithms {
    
    // some data give for the examples
    int[] array = {8, 3, 7, 9, 1, 2, 4};

    // sorts an array of integers.
    public static void sort(int[] array){
        Arrays.sort(array);
    }

    // sorts an array of strings
    public static void sort(String[] array){
        Arrays.sort(array);
    }

    // sorts a list of integers
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }

    //  sorts a list of strings
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}
