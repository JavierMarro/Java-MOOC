package JavaMOOC2.Part9.Exercise3Polymorphism;


public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory productLog;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.productLog = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.productLog.add(super.getBalance());
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.productLog.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double stockTaken = super.takeFromWarehouse(amount);
        this.productLog.add(super.getBalance());
        return stockTaken;
    }

    public String history(){
        return productLog.toString();
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + productLog.maxValue());
        System.out.println("Smallest amount of product: " + productLog.minValue());
        System.out.println("Average: " + productLog.average());
    }
}

