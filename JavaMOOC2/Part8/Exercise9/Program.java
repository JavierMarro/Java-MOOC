package JavaMOOC2.Part8.Exercise9;

import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here! (code from UoH)
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    // My two methods to solve the problem
    public static void printValues(HashMap<String,Book> hashmap){
        for(String key : hashmap.keySet()){
                System.out.println(hashmap.get(key));
        }
    }
    // model answer to the method above:
    // public static void printValues(HashMap<String, Book> hashmap) {
    //     for (Book value : hashmap.values()) {
    //         System.out.println(value);
    //     }
    // }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        // I did the following to sanitise the text used for the search. Can be refactored to own method.
        if (text == null) {
            System.out.println("");
        }

        text = text.toLowerCase();
        text = text.trim();

        for(Book book : hashmap.values()){
            if(book.getName().contains(text)){
                System.out.println(book);
            }
        }
    }

}
