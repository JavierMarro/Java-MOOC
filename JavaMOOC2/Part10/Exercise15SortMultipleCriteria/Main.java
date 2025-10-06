package JavaMOOC2.Part10.Exercise15SortMultipleCriteria;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation:");
            int age = Integer.parseInt(scanner.nextLine());
            
            bookList.add(new Book(title, age));
        }
        
        Comparator<Book> criteria = Comparator
                .comparing(Book::getAgeRange)
                .thenComparing(Book::getTitle);
        Collections.sort(bookList, criteria);
        
        System.out.println(bookList.size() + " books in total.");
        System.out.println("\nBooks:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
    
}
