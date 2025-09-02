package JavaMOOC2.Part8.Exercise13;


import java.util.ArrayList;
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    //Own code starting here
    @Override
    public boolean equals(Object object) {

        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }

        final LicensePlate newLicense = (LicensePlate) object;
        if (!this.liNumber.equals(newLicense.liNumber) || !this.country.equals(newLicense.country)) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        String[] arrLiNum = liNumber.split("-");
        int intLiNum = arrLiNum[0].hashCode();
        int intCountry = country.hashCode();
        hash = 19 * hash + intLiNum;
        hash = 19 * hash + intCountry;
        return hash;
    }

}

// Model answer
// @Override
//     public int hashCode() {
//         int hash = 7;
//         hash = 89 * hash + Objects.hashCode(this.liNumber);
//         hash = 89 * hash + Objects.hashCode(this.country);
//         return hash;
//     }
 
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) {
//             return true;
//         }
//         if (obj == null) {
//             return false;
//         }
//         if (getClass() != obj.getClass()) {
//             return false;
//         }
//         final LicensePlate other = (LicensePlate) obj;
//         if (!Objects.equals(this.liNumber, other.liNumber)) {
//             return false;
//         }
//         if (!Objects.equals(this.country, other.country)) {
//             return false;
//         }
//         return true;
//     }
