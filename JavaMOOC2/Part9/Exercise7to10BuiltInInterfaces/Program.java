package JavaMOOC2.Part9.Exercise7to10BuiltInInterfaces;

import java.util.List;
import java.util.Map;
import java.util.Set;

//Solutions to practising built-in interfaces as method parameter

public class Program {

    public static void main(String[] args) {
        // You can test your method here

    }

    // 1. Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    // Used String as I wasn't aware of the use of ?
    // Model answer gave returnSize(List list) but this way is outdated
    public static int returnSize(List<String> list){
        return list.size();
    }

    // 2. Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object

    public static int returnSize(Map<String, ?> list){
        return list.size();
    }

    // 3. implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    // the paramenter ? is an unbounded wildcard so Interfaces like Set, Map or List are type safe
    public static int returnSize(Set<?> list){
        return list.size();
    }

}
