package JavaMOOC1.part7.Exercise5;


import java.util.ArrayList;
import java.util.Scanner;

public class LinearBinaryProgram {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write (all given by UoH)
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }
    // All the code above given by UoH
    // Code below is my implementation of linearSearch and Binary Search
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getId() == searchedId){
                return i;
            }             
        }
        return - 1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        //Pseudo code for binarySearch algorithm
        // assuming the variable searched exits
        // assuming the variable list exits
        // begin = 0 // the 0th index of the list (i.e, the first index of the list)
        // end = size(list) - 1 // the last index in the list

        // repeat until begin is larger than end:
        //     middle = (end + begin) / 2

        //     if the value at list[middle] is searched
        //         return the value of the variable middle

        //     if the value at list[middle] is smaller than searched
        //         begin = middle + 1

        //     if the value at list[middle] is larger than searched
        //         end = middle - 1

        // return value -1

        int startIndex = 0;
        int endIndex = books.size() - 1;

        while(startIndex <= endIndex){

            int middleIndex = (endIndex + startIndex) / 2;

            if(books.get(middleIndex).getId() == searchedId){
                return middleIndex;
            }

            if(books.get(middleIndex).getId() < searchedId){
                startIndex = middleIndex + 1;
            }

            if(books.get(middleIndex).getId() > searchedId){
                endIndex = middleIndex - 1;
            }

        }

        return -1;
        
    }
}

// Pseudo code for binary search:
// The array or list searched must be sorted (or like in this exercise, data given already sorted)

// The search begins in the middle of the array or list

// If the value in the middle-point being examined isn't the searched value, eliminate half of the searched area, and move on to examine the middle-point of the remaining half.

// If the value in the middle-point being examined is the searched value, return the index of the middle-point being examined.

// If there is nowhere left to search (the entire area has been eliminated), return the value -1, indicating that the searched value was not found (i.e, it wasn't in the list or array searched).
