package JavaMOOC2.Part8.Exercise14;

import java.util.ArrayList;
import java.util.HashMap;

// Code below written from scratch
public class StorageFacility {
    
    private final HashMap<String, ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());

        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        // My initial code, then refactored to the return statement
        // if(!this.storage.containsKey(storageUnit)){
        //     return new ArrayList<String>();
        // }
        
        // return this.storage.get(storageUnit);
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item){
        
        if (!this.storage.containsKey(storageUnit)){
            return;
        }
        
        ArrayList<String> itemList = this.storage.get(storageUnit);

        for (int i = 0; i < itemList.size(); i++){
            if (itemList.get(i).equals(item)){
                itemList.remove(i);
                break;
            }
        }

        if (itemList.size() == 0){
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){

        ArrayList<String> storageList = new ArrayList<>();

        for (String container : this.storage.keySet()) {
            if (!this.storage.get(container).isEmpty()){
                storageList.add(container);
            }
        }
        return storageList;
    }
}

// Model answer
// public class StorageFacility {
 
//     private HashMap<String, ArrayList<String>> unitsAndContents;
 
//     public StorageFacility() {
//         this.unitsAndContents = new HashMap();
//     }
 
//     public void add(String unit, String item) {
//         this.unitsAndContents.putIfAbsent(unit, new ArrayList<>());
//         this.unitsAndContents.get(unit).add(item);
//     }
 
//     public ArrayList<String> contents(String storageUnit) {
//         return this.unitsAndContents.getOrDefault(storageUnit, new ArrayList<>());
//     }
 
//     public void remove(String storageUnit, String item) {
//         if (!this.unitsAndContents.containsKey(storageUnit)) {
//             return;
//         }
 
//         this.unitsAndContents.get(storageUnit).remove(item);
 
//         if (this.unitsAndContents.get(storageUnit).isEmpty()) {
//             this.unitsAndContents.remove(storageUnit);
//         }
//     }
 
//     public ArrayList<String> storageUnits() {
//         ArrayList<String> units = new ArrayList<>();
//         for (String unit : this.unitsAndContents.keySet()) {
//             units.add(unit);
//         }
 
//         return units;
//     }
// }
