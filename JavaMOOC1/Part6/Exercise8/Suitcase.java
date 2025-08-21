package JavaMOOC1.Part6.Exercise8;
import java.util.ArrayList;

//All code below produced by me
public class Suitcase {
    
    private ArrayList<Item> itemList;
    private int maxWeight;

    public Suitcase(int weightLimit){
        this.itemList = new ArrayList<>();
        this.maxWeight = weightLimit;
    }

    public void addItem(Item item){
        
        int excessWeight = totalWeight() + item.getWeight();

        if (item.getWeight() > this.maxWeight){
            return;
        } else if (excessWeight > this.maxWeight) {
            return;
        }

        this.itemList.add(item);

    }

    public int totalWeight(){
        int addedWeight = 0;
        for (Item item : this.itemList){
            addedWeight+= item.getWeight();
        }
        return addedWeight;
    }

    public void printItems() {

        for (Item item : this.itemList) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        // return a null reference if there's no element in list
        if (this.itemList.isEmpty()) {
            return null;
        }

        // create an object reference for it to be returned
        // its first value is the first item on the list
        Item heavyItem = this.itemList.get(0);

        // go through the list
        for (Item item : this.itemList) {
            // compare each item on the list
            // to the returnObj -- we compare integers
            // since we're searching for the heaviest,

            if (heavyItem.getWeight() < item.getWeight()) {
                // if we find a heaviest item in the comparison,
                // we assign it as the value of the returnObj
                heavyItem = item;
            }
        }

        // finally, the object reference describing the
        // return string is returned
        return heavyItem;
    }

    @Override
    public String toString() {

        if (this.itemList.isEmpty()) {
            return "no items (0 kg)";
        }

        String printOutput = "";
        int totalWeight = totalWeight();

        if (this.itemList.size() == 1) {
            printOutput = "1 item " + " (" + totalWeight + " kg)";
        } else {
            printOutput = this.itemList.size() + " items (" + totalWeight + " kg)";
        }

        return printOutput;
    }
}

