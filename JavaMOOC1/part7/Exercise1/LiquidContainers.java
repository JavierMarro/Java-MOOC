package JavaMOOC1.part7.Exercise1;
// This is an example of a problem solved following Procedural programming
// The file called LiquidContainers2 and Container cover a solution to the same problem following OOP

import java.util.Scanner;

public class LiquidContainers {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] command = input.split(" ");
            int amount = Integer.valueOf(command[1]);
            
            if (command[0].equals("add")){
                if(first + amount >= 101){
                    first = 100;
                } else if (amount > 0) {
                    first = first + amount;
                }
            }

            if (command[0].equals("move")){
                if (amount > first){
                    second = first + second;
                    first = 0;
                } else if (second + amount >= 101){
                    second = 100;
                    if (amount > first){
                        first = 0;
                    }
                    first = first - amount;
                } else {
                    second+= amount; 
                    first-= amount;
                }
            }

            if (command[0].equals("remove")){
                if (amount > second){
                    second = 0;
                } else {
                    second-= amount;
                }
            }
        }
    }
}

