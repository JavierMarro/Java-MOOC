package JavaMOOC2.Part9.Exercise4Abstract;

import java.util.ArrayList;

// fully written from scratch
public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> itemList;
    private int maxWeight;

    public BoxWithMaxWeight(int capacity) {
        this.itemList = new ArrayList<>();
        this.maxWeight = capacity;
    }

    @Override
    public void add(Item item) {
        int total = 0;

        for (Item thing : itemList) {
            total+= thing.getWeight();
        }

        if ((item.getWeight() + total) > this.maxWeight){
            return;
        }
        
        this.itemList.add(item);
        
    }

    @Override
    public boolean isInBox(Item item){
        return itemList.contains(item);
    }
    
}

