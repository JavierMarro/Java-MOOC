package JavaMOOC2.Part10.Exercise10FilesAndStream;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

// my solution below
    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();
        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get(file))
                // splitting the row into parts on the "," character
                .map(row -> row.split(","))
                // deleting the split rows that have less than four parts (we want the rows to always contain the name, publishing year, page count and author)
                .filter(parts -> parts.length >= 4)
                // creating persons from the parts
                .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                // and finally add the persons to the list
                .forEach(book -> books.add(book));
                //the above could also have been done collecting the data to a List and in this case line 21 could be omitted along with line 32
                // .collect(Collectors.toList());
                // then returning a new Arraylist outside the try block
                // or it could have also be done like this, not needing the outside return statement
                // .collect(Collectors.toCollection(ArrayList::new));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }

}
