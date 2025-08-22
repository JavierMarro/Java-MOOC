package JavaMOOC2.Part8.Exercise2;

import java.util.HashMap;

// practising with HashMaps and the containsKey method to check for the existence of a key.
public class Abbreviations {
    
    private HashMap<String, String> entries;

    public Abbreviations(){
        entries = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        this.entries.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return this.entries.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){

        if (!this.hasAbbreviation(abbreviation)) {
            return null;
        } 
        
        return this.entries.get(abbreviation);
    }
}

