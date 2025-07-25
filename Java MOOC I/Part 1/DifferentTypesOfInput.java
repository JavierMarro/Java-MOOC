// Set of 5 exercises getting user input and manipulating different types of variables

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Write your program here
            System.out.println("Give a string: ");
            String text = scan.nextLine();
            System.out.println("Give an integer: ");
            int numInput = Integer.valueOf(scan.nextLine());
            System.out.println("Give a double: ");
            double floatInput = Double.valueOf(scan.nextLine());
            System.out.println("Give a boolean: ");
            boolean value = Boolean.valueOf(scan.nextLine());
            
            System.out.println("You gave the string " + text);
            System.out.println("You gave the integer " + numInput);
            System.out.println("You gave the double " + floatInput);
            System.out.println("You gave the boolean " + value);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
