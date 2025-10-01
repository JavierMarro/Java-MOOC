package JavaMOOC2.Part10.Exercise4TerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PositiveNums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    // My solution
    public static List<Integer> positive(List<Integer> numbers){
        
        ArrayList<Integer> list = numbers.stream()
        .filter(num -> num > 0)
        .collect(Collectors.toCollection(ArrayList::new));

        return list;
    }

    // Refactored using Predicate
    public static List<Integer> positiveNums(List<Integer> numbers) {
    Predicate<Integer> isPositive = num -> num > 0;

    return numbers.stream()
        .filter(isPositive)
        .collect(Collectors.toCollection(ArrayList::new));
    }

    // Model answer
    public static List<Integer> positives(List<Integer> numbers) {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toList());
    }
}
