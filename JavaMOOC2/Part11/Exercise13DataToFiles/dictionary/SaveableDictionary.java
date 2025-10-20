package JavaMOOC2.Part11.Exercise13DataToFiles.dictionary;

import java.util.HashMap;

public class SaveableDictionary {
    // Part 1: Setting up the class + 2 methods (add, translate)   
    private HashMap<String, String> dictionary;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){
        // method putIfAbsent already ensures that the same word cannot be added twice
        this.dictionary.putIfAbsent(word, translation);

    }

    public String translate(String word){
        if(!this.dictionary.containsKey(word)){
            return null;
        }
        
        return this.dictionary.get(word);
    }
}

