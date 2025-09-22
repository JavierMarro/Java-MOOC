package JavaMOOC2.Part8.Exercise10HashMapsPrimitiveVar;

import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debt;
    
    public IOU(){
        this.debt = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        if (this.debt.containsKey(toWhom)){
            double total = this.debt.get(toWhom);
            total+= amount;
        } else {
            this.debt.put(toWhom, amount);
        }
    }

    public double howMuchDoIOweTo(String toWhom){
        if (!this.debt.containsKey(toWhom)){
            return 0;
        } else {
            return this.debt.get(toWhom);
        }
    }
}

// model answer for second method using getOrDefault method
// public double howMuchDoIOweTo(String toWhom) {
//         return debt.getOrDefault(toWhom, 0.0);
//     }
