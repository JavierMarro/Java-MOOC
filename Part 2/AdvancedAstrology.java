
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = number; i > 0; i--){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = number; i > 0; i--){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int row = 1;
        for (int i = size; i >= row; row++){
            printSpaces(size - row);
            printStars(row);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // Help from different StackOverflow sources to come up with answer
        // https://stackoverflow.com/questions/54033289/how-to-print-a-christmas-tree-in-java-by-calling-methods
        // top tree
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        // base tree
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

// Model answer by University of Helsinki
// public class AdvancedAstrology {
 
//     public static void printStars(int number) {
//         // part 1 of the exercise
//         int i = 0;
//         while (i < number) {
//             System.out.print("*");
//             i++;
//         }
//         System.out.println("");
//     }
 
//     public static void printSpaces(int number) {
//         // part 1 of the exercise
//         int i = 0;
//         while (i < number) {
//             System.out.print(" ");
//             i++;
//         }
//     }
 
//     public static void printTriangle(int size) {
//         // part 2 of the exercise
//         // let's start from 1 because the first line should have one star!
//         int i = 1;
//         while (i <= size) {
//             printSpaces(size - i);
//             printStars(i);
//             i++;
//         }
//     }
 
//     public static void christmasTree(int height) {
//         // part 3 of the exercise
//         // Let's first print the top of the tree. 
//         // This works almost like the triangle.
//         int i = 1;
//         while (i <= height) {
//             printSpaces(height - i);
//             printStars(i + (i - 1));
//             i++;
//         }
 
//         // End then the bottom.
//         printSpaces(height - 2);
//         printStars(3);
//         printSpaces(height - 2);
//         printStars(3);
//     }
 
//     public static void main(String[] args) {
//         // The tests are not checking the main, so you can modify it freely.
 
//         printTriangle(5);
//         System.out.println("---");
//         christmasTree(4);
//         System.out.println("---");
//         christmasTree(10);
//     }
// }
