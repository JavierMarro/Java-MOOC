// Complete the method public static void printArrayInStars(int[] array) in the class named 'Printer' to make it print a row of stars for each number in the array. The amount of stars on each row is defined by the corresponding number in the array.

public class StarPrinter {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int i = 0; i < array.length; i++){
            String stars = "";
            int numStars = array[i];
            for (int j = 0; j < numStars; j++){
                stars+= "*";
            } 
            System.out.print(stars);
            System.out.println();
        }
    }

}

// Model answer
// public static void printArrayInStars(int[] array) {
//         // Write some code in here
//         for (int stars : array) {
//             printStars(stars);
//             System.out.println();
//         }
//     }
 
//     public static void printStars(int howMany) {
//         while (howMany > 0) {
//             System.out.print("*");
//             howMany = howMany - 1;
//         }
//     }
