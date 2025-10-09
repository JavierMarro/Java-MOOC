package JavaMOOC2.Part10.Exercise15SortMultipleCriteria;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRating = Integer.valueOf(scanner.nextLine());
        
            // Books added according to user input
            books.add(new Book(bookTitle, ageRating));
        }

        int booksNum= books.size();
            System.out.println(booksNum + " books in total.");

            // Comparator interface used which gives access to sorting methods
            // Chaining methods here works similarly to using stream()
            // List books sorted by age first using comparing()
            // then sorted by alphabetical order using thenComparing()
            Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRating)
                .thenComparing(Book::getTitle);

            // Collections interface. used to create a new sorted list using books (line 12) and comparator (line 37)
            Collections.sort(books, comparator);

            //Iterate through with a for loop to display the now sorted results
            System.out.println("Books: ");
            for (Book b : books){
                System.out.println(b);
            }
    }

}

