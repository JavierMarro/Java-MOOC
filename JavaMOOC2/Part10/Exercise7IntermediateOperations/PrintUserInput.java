package JavaMOOC2.Part10.Exercise7IntermediateOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<String> allInputs = new ArrayList<>();
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()){
                break;
            }
            allInputs.add(userInput);
        }

        allInputs.stream().forEach(input -> System.out.println(input));
    }
}