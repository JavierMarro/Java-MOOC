package JavaMOOC2.Part10.Exercise7IntermediateOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> allNums = new ArrayList<>();
        Predicate<Integer> chosenNums = num -> num > 0 && num < 6;

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput < 0){
                break;
            }
            allNums.add(userInput);
        }

        allNums.stream().filter(chosenNums).forEach(input -> System.out.println(input));
    }
    
}
