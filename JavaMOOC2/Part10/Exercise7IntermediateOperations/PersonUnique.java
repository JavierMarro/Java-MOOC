package JavaMOOC2.Part10.Exercise7IntermediateOperations;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PersonUnique {

    // Given by UoH
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String continueQ = "quit";
            if(scanner.hasNextLine()){continueQ = scanner.nextLine();}

            if (continueQ.equals("quit")) {
                break;
            }

            System.out.print("Input first name: ");
            String firstName = "NaN";
            if(scanner.hasNextLine()){firstName = scanner.nextLine();}
            System.out.print("Input last name: ");
            String lastName = "NaN";
            if(scanner.hasNextLine()){lastName = scanner.nextLine();}
            System.out.print("Input the year of birth: ");
            int birthYear = 0;
            if(scanner.hasNextLine()){birthYear = Integer.valueOf(scanner.nextLine());}

            people.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        }

        // My solution: Implement the printing of the unique last names in alphabetical order here:
        Set<String> uniqueLastNames = people.stream()
            .map(Person::getLastName)
            .collect(Collectors.toCollection(TreeSet::new));

        uniqueLastNames.forEach(System.out::println);


        // Extra information found online about TreeSet for refactoring this task
        // Set<String> uniqueLastNames = people.stream()
        //     .map(Person::getLastName)
        //     .collect(Collectors.toCollection(TreeSet::new));

        // uniqueLastNames.forEach(System.out::println);
        // A TreeSet in Java is a type of Set (so it stores unique elements, no duplicates allowed) but with the added property that it keeps the elements sorted in their “natural order” (or by a custom comparator you provide).

    }
}
