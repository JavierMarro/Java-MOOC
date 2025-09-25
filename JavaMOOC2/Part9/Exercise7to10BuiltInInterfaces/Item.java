package JavaMOOC2.Part9.Exercise7to10BuiltInInterfaces;


public class Item {
    
    private String productName;
    private int amount;
    private int cost;

    public Item(String product, int qty, int unitPrice){
        this.productName = product;
        this.amount = qty;
        this.cost = unitPrice;
    }

    public int price(){
        return this.amount * this.cost;
    }

    public void increaseQuantity(){
        this.amount++;
    }

    public String toString(){
        return this.productName + ": " + this.amount;
    }
}

