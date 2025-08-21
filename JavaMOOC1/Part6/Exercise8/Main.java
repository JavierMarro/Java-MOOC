package JavaMOOC1.Part6.Exercise8;

public class Main {

    public static void main(String[] args) {
        // Test your class here (all the code below given by UoH)
    // Part 1 & 2: Test created classes Item & Suitcase
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);

        // Part 4: Testing methods for class Suitcase
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

        // Part 5: Testing methods for class Suitcase
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

        // Part 6: Test created class Hold
        Hold hold = new Hold(1000);
        Suitcase bobsCase = null;
        hold.addSuitcase(bobsCase);

        System.out.println(hold);

        // Part 7: Testing methods for class Hold
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();   
    }
    
}
