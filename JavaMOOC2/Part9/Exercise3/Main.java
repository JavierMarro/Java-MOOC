package JavaMOOC2.Part9.Exercise3;


public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes (provided by UoH)
        // Part 1
        // This is obsolete after creating the new class: ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        //Part 2
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.299999999999955
        // Part 3, 4, 5 & 6
        // however, history() still doesn't work properly:
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        //Part 7
        juice.printAnalysis();
    }

}

