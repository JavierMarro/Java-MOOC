// Task:
// Write a program that asks the user for a string, and then prints the contents of a file with a name matching the string provided. 
// You may assume that the user provides a file name that the program can find.

package JavaMOOCI.Part4.Exercise24;


import java.nio.file.Paths;
import java.util.Scanner;

public class MatchingReadingFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();

        if (fileName.equals(fileName)){
            try (Scanner scan = new Scanner(Paths.get(fileName))) {
            // we read the file until all lines have been read
            while (scan.hasNextLine()) {
                // we read one line
                String row = scan.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception error) {
            // handle exception
            System.out.println("Error: " + error.getMessage());
        }
        }
    }
}

// Model answer
//  public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
 
//         System.out.println("Which file should have its contents printed?");
//         String file = scanner.nextLine();
 
//         try (Scanner fileReader = new Scanner(Paths.get(file))) {
//             while (fileReader.hasNextLine()) {
//                 System.out.println(fileReader.nextLine());
//             }
//         } catch (Exception e) {
//             System.out.println("Reading the file failed.");
//         }
 
//     }

