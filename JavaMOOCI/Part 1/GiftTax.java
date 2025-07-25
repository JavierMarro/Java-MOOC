// Last exercise to practise conditional statements

import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Value of the gift?");
        int value = Integer.parseInt(scan.nextLine());

        if (value >= 5000 && value < 25000) {
            int lowerLimit = 100;
            double taxRate = 0.08;
            double total = (lowerLimit + (value - 5000) * taxRate);
            System.out.println("Tax: " + total);
        } else if (value >= 25000 && value < 55000) {
            int lowerLimit = 1700;
            double taxRate = 0.10;
            double total = (lowerLimit + (value - 25000) * taxRate);
            System.out.println("Tax: " + total);
        } else if (value >= 55000 && value < 200000) {
            int lowerLimit = 4700;
            double taxRate = 0.12;
            double total = (lowerLimit + (value - 55000) * taxRate);
            System.out.println("Tax: " + total);
        } else if (value >= 200000 && value < 1000000) {
            int lowerLimit = 22100;
            double taxRate = 0.15;
            double total = (lowerLimit + (value - 200000) * taxRate);
            System.out.println("Tax: " + total);
        } else if (value >= 1000000 ) {
            int lowerLimit = 142100;
            double taxRate = 0.17;
            double total = (lowerLimit + (value - 1000000) * taxRate);
            System.out.println("Tax: " + total);
        } else {
            System.out.println("No tax!");
        }
    }
}

