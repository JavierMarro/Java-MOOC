package JavaMOOC2.Part9.Exercise3;

import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public double maxValue(){
        if (this.history.size() == 0){
            return 0;
        } else {
            double biggestNum = 0;
            for (Double entry : this.history){
                if (entry > biggestNum){
                    biggestNum = entry;
                }
            }
            return biggestNum;
        }
    }

    public double minValue(){
        if (this.history.size() == 0){
            return 0;
        } else {
            double smallestNum = this.history.get(0);
            for (Double entry : this.history){
                if (entry < smallestNum){
                    smallestNum = entry;
                }
            }
            return smallestNum;
        }
    }

    public double average(){
        if (this.history.size() == 0){
            return 0;
        } else {
            // started with the code below and then refactored
            // double total = 0;
            // int entries = 0;
            // for (Double entry : this.history){
            //     total+= entry;
            //     entries++;
            // }
            // return total / entries;

            double total = 0;
            for (Double entry : this.history){
                total+= entry;
            }
            return total / this.history.size();
        }
    }


    @Override
    public String toString(){
        return "" + this.history;
        // I had also done: return this.history.toString() and thought it didn't work. It turns out it does.
        // I didn't know, but turns out my solution to this method implicitly calls .toString()
    }
}

