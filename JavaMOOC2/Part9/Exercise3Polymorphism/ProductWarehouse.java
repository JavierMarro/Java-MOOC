package JavaMOOC2.Part9.Exercise3Polymorphism;

public class ProductWarehouse extends Warehouse{
    
    private String product;

    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.product = productName;
    }

    public String getName(){
        return this.product;
    }

    public void setName(String newName){
        this.product = newName;
    }

    public String toString(){
        return getName() + ": " + super.toString();
    }

}

