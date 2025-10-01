package JavaMOOC2.Part10.Exercise2StreamMethod;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        // basic step for this practice: read and add inputs to a list
        List<String> allNums = new ArrayList<>();
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("end")){
                break;
            }
            allNums.add(userInput);
        }

        // Practice 1: counting number of inputs entered by user
        long total = allNums.stream()
        .mapToInt(i -> Integer.valueOf(i))
        .count();

        System.out.println(total);

        // Practice 2: working out the average of nums entered
        double avg = allNums.stream()
        .mapToInt(a -> Integer.valueOf(a))
        .average()
        .getAsDouble();

        System.out.println("average of the numbers: " + avg);
        // Model answer:
        // System.out.println("average of the numbers: " + input.stream().mapToInt(i -> i).average().getAsDouble());

        // Practice 3: printing different average amount upon user request
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String userRequest = scanner.nextLine();
        if (userRequest.equals("n")){
            double negativeAvg = allNums.stream()
            .mapToInt(n -> Integer.valueOf(n))
            .filter(number -> number < 0)
            .average()
            .getAsDouble();

            System.out.println("average of the numbers: " + negativeAvg);
        } else {
            double positiveAvg = allNums.stream()
            .mapToInt(p -> Integer.valueOf(p))
            .filter(number -> number > 0)
            .average()
            .getAsDouble();

            System.out.println("average of the numbers: " + positiveAvg);
        }

        // I refactored the above using a ternary statement
        double average = userRequest.equals("n")
            ? allNums.stream()
                .mapToInt(negative -> Integer.valueOf(negative))
                .filter(number -> number < 0)
                .average()
                .getAsDouble()
            : allNums.stream()
                .mapToInt(positive -> Integer.valueOf(positive))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);

        // Further refactored the above to use lambda expressions
        double chosenAvg = userRequest.equals("n")
            ? allNums.stream()
                .mapToInt(Integer::valueOf)
                .filter(number -> number < 0)
                .average()
                .getAsDouble()
            : allNums.stream()
                .mapToInt(Integer::valueOf)
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + chosenAvg);

        // Upon reading on streams, found the interface Predicate which would help refactor even further
        Predicate<Integer> filterCondition = userRequest.equals("n")
            ? number -> number < 0
            : number -> number > 0;

        double finalAvg = allNums.stream()
            .mapToInt(Integer::valueOf)
            .filter(filterCondition::test)
            .average()
            .orElse(0.0); // safer than getAsDouble()

        System.out.println("average of the numbers: " + finalAvg);

        // This is the Model answer
        // String choise = scanner.nextLine();
        // if (choise.equals("n")) {
        //     System.out.println("Average of the negative numbers: " + input.stream().filter(l -> l < 0).mapToInt(i -> i).average().getAsDouble());
        // } else {
        //     System.out.println("Average of the positive numbers: " + input.stream().filter(l -> l > 0).mapToInt(i -> i).average().getAsDouble());
        // }
 
    }
}

