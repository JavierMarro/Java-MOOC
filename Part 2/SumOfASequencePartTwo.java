import java.util.Scanner;

public class SumOfASequencePartTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number? ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
    
        int total = 0;
        for (int i = firstNum; i <= lastNum; i++){
            total = total + i;
        }
        System.out.println("The sum is " + total);
    }
}

// Solution with a while loop:
// public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
 
//         System.out.print("First number? ");
//         int first = Integer.valueOf(scanner.nextLine());
//         System.out.print("Last number? ");
//         int last = Integer.valueOf(scanner.nextLine());
//         int sum = 0;
 
//         int number = first;
//         while (number <= last) {
//             sum += number;
//             number++;
//         }
 
//         System.out.println("The sum is " + sum);
 
//     }
