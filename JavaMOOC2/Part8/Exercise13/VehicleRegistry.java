package JavaMOOC2.Part8.Exercise13;

import java.util.ArrayList;
import java.util.HashMap;

// Class created from scratch
public class VehicleRegistry {
    
    private final HashMap<LicensePlate, String> vehicle;
    
    public VehicleRegistry(){
        this.vehicle = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        String matchedOwner = this.vehicle.get(licensePlate);
        if (matchedOwner != null){
            return false;
        } else {
            this.vehicle.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate){
        if(!this.vehicle.containsKey(licensePlate)){
            return null;
        } else {
            return this.vehicle.get(licensePlate);
        }
    }

    public boolean remove(LicensePlate licensePlate){
        if(!this.vehicle.containsKey(licensePlate)){
            return false;
        } else {
            this.vehicle.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates(){
        for(LicensePlate license : this.vehicle.keySet()){
                System.out.println(license);
        }
    }

    public void printOwners(){
        ArrayList<String> allOwners = new ArrayList<>();

        for (String owner : this.vehicle.values())
        if (!allOwners.contains(owner)) {
            allOwners.add(owner);
            System.out.println(owner);
        }
    }

}

// Model answer:
// public class VehicleRegistry {
 
//     private HashMap<LicensePlate, String> owners;
 
//     public VehicleRegistry() {
//         owners = new HashMap<>();
//     }
 
//     public boolean add(LicensePlate licensePlate, String owner) {
//         if (owners.containsKey(licensePlate)) {
//             return false;
//         }
 
//         owners.put(licensePlate, owner);
 
//         return true;
//     }
 
//     public String get(LicensePlate licensePlate) {
//         return owners.get(licensePlate);
//     }
 
//     public boolean remove(LicensePlate licensePlate) {
//         if (!owners.containsKey(licensePlate)) {
//             return false;
//         }
 
//         owners.remove(licensePlate);
 
//         return true;
//     }
 
//     public void printLicensePlates() {
//         for (LicensePlate licensePlate : owners.keySet()) {
//             System.out.println(licensePlate);
//         }
//     }
 
//     public void printOwners() {
//         ArrayList<String> printed = new ArrayList<>();
 
//         for (String owner : owners.values()) {
//             if (printed.contains(owner)) {
//                 continue;
//             }
 
//             System.out.println(owner);
//             printed.add(owner);
//         }
//     }
// }
