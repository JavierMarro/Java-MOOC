package JavaMOOC2.Part9.Exercise4Abstract;

import java.util.ArrayList;

public class OneItemBox extends Box {
    
    private ArrayList<Item> singleItem;

    public OneItemBox(){
        this.singleItem = new ArrayList<>();
    }

    @Override
    public void add(Item item){
        if (this.singleItem.size() == 1){
            return;
        } 
        
        this.singleItem.add(item);
        
    }

    @Override
    public boolean isInBox(Item item){
        return singleItem.contains(item);
    }
}

// Model answer
// public class OneItemBox extends Box {
 
//     private Item item;
 
//     public OneItemBox() {
//     }
 
//     @Override
//     public void add(Item item) {
//         if (this.item != null) {
//             return;
//         }
 
//         this.item = item;
//     }
 
//     @Override
//     public boolean isInBox(Item item) {
//         return this.item != null && this.item.equals(item);
//     }
// }

