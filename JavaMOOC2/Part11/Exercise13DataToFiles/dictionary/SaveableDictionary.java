package JavaMOOC2.Part11.Exercise13DataToFiles.dictionary;

import java.util.HashMap;

public class SaveableDictionary {
    // Part 1: Setting up the class + 2 methods (add, translate)   
    private HashMap<String, String> dictionary;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }

    public void add(String words, String translation){
        // method putIfAbsent already ensures that the same word cannot be added twice
        // the method works either way for word added first or translation added first
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word){
        //checking that the word is not found either as a key or a value (as a word or its translation)
        if(!this.dictionary.containsKey(word) || !this.dictionary.containsValue(word)){
            return null;
        }
        
        return this.dictionary.get(word);
    }

    // Part 2
    public void delete(String word){
        // Entry can be removed by either translation or word if found
        this.dictionary.remove(word);
        this.dictionary.remove(this.dictionary.get(word));
    }
}


