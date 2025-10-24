package JavaMOOC2.Part12.Exercise6to8Randomness;

import java.util.Random;
import java.util.Scanner;

public class SimpleRandomiser {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomPicker = new Random();

        System.out.println("How many random numbers should be printed?");
        int userInput = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < userInput; i++){
            int randomPick = randomPicker.nextInt(11);
            System.out.println(randomPick);
        }
    }
}
