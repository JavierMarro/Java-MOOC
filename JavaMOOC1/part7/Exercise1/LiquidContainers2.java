package JavaMOOC1.part7.Exercise1;
// This is an example of a problem solved following OOP
// The file called LiquidContainers and Container cover a solution to the same problem following Procedural porgramming

import java.util.Scanner;

public class LiquidContainers2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] command = input.split(" ");
            int amount = Integer.valueOf(command[1]);
            
            if (command[0].equals("add")){
                first.add(amount);
            }

            if (command[0].equals("move")){
                if (amount > first.contains()) {
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
            }

            if (command[0].equals("remove")){
                second.remove(amount);
            }
        }
    }
}

