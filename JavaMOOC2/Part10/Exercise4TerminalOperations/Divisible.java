package JavaMOOC2.Part10.Exercise4TerminalOperations;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Divisible {
    
    // Given by UoH
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku)); // luku means number in Finnish
    }

    // My solution
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        Predicate<Integer> divisibleNums = num -> num % 2 == 0 || num % 3 == 0 || num % 5 == 0;

        return numbers.stream()
        .filter(divisibleNums)
        .collect(Collectors.toCollection(ArrayList::new));
    }

    // Model answer
    // public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
    //     return numbers.stream()
    //             .filter(number -> number % 2 == 0 || number % 3 == 0 || number % 5 == 0)
    //             .collect(Collectors.toCollection(ArrayList::new));
    // }
}
