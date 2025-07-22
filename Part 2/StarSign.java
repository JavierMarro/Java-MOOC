
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = number; i > 0; i--){
            System.out.print("*");
        }
        System.out.println();;
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for (int i = size; i > 0; i--){
            printStars(size);
        }
        System.out.println();
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int i = height; i > 0; i--){
            printStars(width);
        }
        System.out.println();
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i = 1; i <= size; i++){
            printStars(i);
        }
    }
}

// Model answer
// public static void printStars(int number) {
//         // first part of the exercise
//         int countPrinted = 0;
//         while (countPrinted < number) {
//             System.out.print("*");
//             countPrinted = countPrinted + 1;
//         }
//         System.out.println("");
//     }
 
//     public static void printSquare(int size) {
//         // second part of the exercise
//         int countPrinted = 0;
//         while (countPrinted < size) {
//             printStars(size);
//             countPrinted = countPrinted + 1;
//         }
//     }
 
//     public static void printRectangle(int width, int height) {
//         // third part of the exercise
//         int countPrinted = 0;
//         while (countPrinted < height) {
//             printStars(width);
//             countPrinted = countPrinted + 1;
//         }
//     }
 
//     public static void printTriangle(int size) {
//         // fourth part of the exercise
//         int line = 1;
//         while (line <= size) {
//             printStars(line);
//             line = line + 1;
//         }
//     }
