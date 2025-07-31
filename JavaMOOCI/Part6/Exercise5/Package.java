package JavaMOOCI.Part6.Exercise5;
import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> giftList;

    public Package(){
        this.giftList = new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.giftList.add(gift);
    }

    public int totalWeight(){
        int total = 0;
        for (Gift gift : this.giftList){
            total+= gift.getWeight();
        }
        return total;
    }
}

// Model answer:
// public class Package {
 
//     private ArrayList<Gift> gifts;
 
//     public Package() {
//         this.gifts = new ArrayList<>();
//     }
 
//     public void addGift(Gift gift) {
//         this.gifts.add(gift);
//     }
 
//     public int totalWeight() {
//         int sum = 0;
//         int index = 0;
 
//         while (index < this.gifts.size()) {
//             sum += this.gifts.get(index).getWeight();
//             index++;
//         }
//         return sum;
//     }
// }
