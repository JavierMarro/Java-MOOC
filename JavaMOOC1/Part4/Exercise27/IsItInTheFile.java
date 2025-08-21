package JavaMOOC1.Part4.Exercise27;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                list.add(fileReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        System.out.println();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if (list.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
        
    }
}

// Model answer:
// public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
 
//         System.out.println("Name of the file:");
//         String file = scanner.nextLine();
 
//         System.out.println("Search for:");
//         String searchedFor = scanner.nextLine();
 
//         int lines = 0;
//         try (Scanner fileReader = new Scanner(Paths.get(file))) {
 
//             while (fileReader.hasNextLine()) {
//                 String line = fileReader.nextLine();
//                 if (!line.contains(searchedFor)) {
//                     continue;
//                 }
 
//                 lines++;
//             }
 
//         } catch (Exception e) {
//             System.out.println("Reading the file " + file + " failed.");
//         }
 
//         if (lines == 0) {
//             System.out.println("Not found.");
//         } else {
//             System.out.println("Found!");
//         }
 
//     }
