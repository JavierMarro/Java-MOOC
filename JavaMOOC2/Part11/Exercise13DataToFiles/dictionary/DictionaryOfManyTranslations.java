package JavaMOOC2.Part11.Exercise13DataToFiles.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
// Exercise completed back in Part 8 when practising HashMaps. Followed for the implementation of SaveableDictionary
public class DictionaryOfManyTranslations {
    private final HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){

        this.dictionary.putIfAbsent(word, new ArrayList<>());

        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        if(!this.dictionary.containsKey(word)){
            return new ArrayList<String>();
        }
        
        return this.dictionary.get(word);
    }

    public void remove(String word){
        this.dictionary.remove(word);
    }
}

