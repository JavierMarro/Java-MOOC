package JavaMOOC2.Part9.Exercise6Interfaces;

import java.util.ArrayList;

public class Box implements Packable{

    private double maxCapacity;
    private ArrayList<Packable> packedItems;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        packedItems = new ArrayList<>();
    }

    public void add(Packable newItem) {
        if (this.weight() + newItem.weight() <= this.maxCapacity) {
        this.packedItems.add(newItem);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable : packedItems){
            weight += packable.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.packedItems.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
