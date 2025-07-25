import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        Statistics userNums = new Statistics();
        Statistics evenNums = new Statistics();
        Statistics oddNums = new Statistics();

        System.out.println("Enter numbers: ");

        while (true){

            int input = Integer.valueOf(scanner.nextLine());

            if (input == - 1) {
                System.out.println("Sum: " + userNums.sum());
                System.out.println("Sum of even numbers: " + evenNums.sum());
                System.out.println("Sum of odd numbers: " + oddNums.sum());
                break;
            }

            userNums.addNumber(input);    

            if (input % 2 == 0){
                evenNums.addNumber(input);
            } else {
                oddNums.addNumber(input);;
            }
        }
        
    }
}
