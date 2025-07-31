package JavaMOOCI.Part6.Exercise8;
import java.util.ArrayList;

// All code below produced by me
public class Hold {
    
    private ArrayList<Suitcase> luggage;
    private int weightCap;


    public Hold(int maxWeight){
        this.luggage = new ArrayList<>();
        this.weightCap = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        
        int totalWeight = 0;
        for (Suitcase bag : this.luggage){
            totalWeight+= bag.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() > this.weightCap){
            return;
        } 
        this.luggage.add(suitcase);
    }

    public void printItems() {
        for (Suitcase bag : this.luggage) {
            bag.printItems();
        }
    }

    @Override
    public String toString() {

        if (this.luggage.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        int weight = 0;
        String printOutput = "";
        for (Suitcase bag : luggage){
            weight+= bag.totalWeight();
        }

        if (this.luggage.size() == 1) {
            printOutput = "1 suitcase " + " (" + weight + " kg)";
        } else {
            printOutput = this.luggage.size() + " suitcases (" + weight + " kg)";
        }

        return printOutput;
    }
}
