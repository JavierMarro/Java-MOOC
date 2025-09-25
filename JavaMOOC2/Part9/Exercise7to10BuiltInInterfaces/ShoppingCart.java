package JavaMOOC2.Part9.Exercise7to10BuiltInInterfaces;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private Map<String, Item> cart;

    public ShoppingCart(){
        this.cart = new HashMap<>();
    }

    public void add(String product, int price){
        if (this.cart.containsKey(product)){
            Item cartItem = cart.get(product);
            cartItem.increaseQuantity();
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }
    }
    // Model answer for method add
    // public void add(String product, int price) {
    //     this.items.putIfAbsent(product, new Item(product, 0, price));
    //     this.items.get(product).increaseQuantity();
    // }

    public int price(){
        int total = 0;
        for (Item product : this.cart.values()){
            total+= product.price();
        }
        return total;
    }

    public void print(){
        for (Item product : this.cart.values()){
            System.out.println(product);
        }
    }
   
}

