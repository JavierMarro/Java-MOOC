package JavaMOOC2.Part9.Exercise2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here (Part 1 to Part 4 given by UoH

        // Part 1
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        // Part 2:
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());

        // Part 3
        Student sam = new Student("Sam", "6381 Silicon Blvd. Los Angeles 90028");
        System.out.println(sam);
        sam.study();
        System.out.println(sam);

        // Part 4
        Teacher mary = new Teacher("Mary Lovelace", "24 Maddox St. Bristol W1S 2QN", 1200);
        Teacher saga = new Teacher("Saga Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(mary);
        System.out.println(saga);

        Student adam = new Student("Adam", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
        ollie.study();
        i = i + 1;
        }
        System.out.println(ollie);

    }

    // Part 5 (task developed by me)
    public static void printPersons(ArrayList<Person> people){
        for (Person person : people) {
            System.out.println(person);
        }
    }

}

