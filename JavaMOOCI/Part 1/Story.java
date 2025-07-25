// First 10 exercises where about printing and str concatenation, last exercise shown below

import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Write your program here
            System.out.println("I will tell you a story, but I need some information first.");
            System.out.println("What is the main character called?");
            String answerOne = scanner.nextLine();

            System.out.println("What is their job?");
            String answerTwo = scanner.nextLine();

            System.out.println("Here is the story:");
            System.out.println("Once upon a time there was " + answerOne + ", who was " + answerTwo + ".");
            System.out.println("On the way to work, " + answerOne + " reflected on life.");
            System.out.println("Perhaps " + answerOne + " will not be " + answerTwo + " forever.");
        }
    }
}