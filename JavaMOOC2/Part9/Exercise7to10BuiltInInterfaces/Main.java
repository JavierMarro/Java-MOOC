package JavaMOOC2.Part9.Exercise7to10BuiltInInterfaces;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your app here (code by UoH)
        // Part 1
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));

        //Part 2
        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        //Part 3
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product: warehouse.products()) {
            System.out.println(product);
        }

        //Part 4
        Item item = new Item("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);

        //Part 5
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.add("buttermilk", 2);
        cart.add("cheese", 5);
        System.out.println("cart price: " + cart.price());
        cart.add("computer", 899);
        System.out.println("cart price: " + cart.price());
        
        //Part 7
        ShoppingCart trolley = new ShoppingCart();
        trolley.add("water", 3);
        trolley.print();
        System.out.println("cart price: " + cart.price() + "\n");

        trolley.add("bread", 2);
        trolley.print();
        System.out.println("cart price: " + cart.price() + "\n");

        trolley.add("water", 3);
        trolley.print();
        System.out.println("cart price: " + cart.price() + "\n");

        trolley.add("water", 3);
        trolley.print();
        System.out.println("cart price: " + cart.price() + "\n");

        //Part 8
        Warehouse depot = new Warehouse();
        depot.addProduct("coffee", 5, 10);
        depot.addProduct("milk", 3, 20);
        depot.addProduct("cream", 2, 55);
        depot.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(depot, scanner);
        store.shop("John");
    }
}

