package JavaMOOC2.Part9.Exercise7to10BuiltInInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> product;
    private Map<String, Integer> productStock;

    public Warehouse(){
        this.product = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.product.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product){
        if (this.product.get(product) == null){
            return -99;
        }
        return this.product.get(product);
    }

    public int stock(String product){
        if (!this.productStock.containsKey(product)){
            return 0;
        }
        return this.productStock.get(product);
    }

    public boolean take(String product){
        
        if (!this.productStock.containsKey(product)){
            return false;
        } else if (this.productStock.get(product) == 0){
            return false;
        } else {
            int currentStock = this.productStock.get(product);
            currentStock--;
            this.productStock.put(product, currentStock);
            return true;
        }    
    }

    public Set<String> products(){
        return this.product.keySet();
    }
    
}

// Model answer
// public class Warehouse {
 
//     private Map<String, Integer> prices;
//     private Map<String, Integer> quantities;
 
//     public Warehouse() {
//         this.prices = new HashMap<>();
//         this.quantities = new HashMap<>();
//     }
 
//     public void addProduct(String product, int price, int stock) {
//         this.prices.put(product, price);
//         this.quantities.put(product, stock);
//     }
 
//     public int price(String product) {
//         return this.prices.getOrDefault(product, -99);
//     }
 
//     public int stock(String product) {
//         return this.quantities.getOrDefault(product, 0);
//     }
 
//     public boolean take(String product) {
//         if (!this.quantities.containsKey(product)) {
//             return false;
//         }
        
//         int stock = this.quantities.get(product);
//         if (stock <= 0) {
//             return false;
//         }
 
//         this.quantities.put(product, stock - 1);
//         return true;
//     }
 
//     public Set<String> products() {
//         return this.quantities.keySet();
//     }
// }

