package JavaMOOC2.Part11.Exercise13DataToFiles.dictionary;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SaveableDictionary {
    // Part 1 + 3: Setting up the class, fields and constructor + 2 methods (add, translate)   
    private HashMap<String, String> dictionary;
    private String fileName;

    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }
    // Found out about constructor chaining for part 3 https://www.baeldung.com/java-chain-constructors
    public SaveableDictionary(String file){
        this();
        this.fileName = file;
    }

    public void add(String words, String translation){
        // method putIfAbsent already ensures that the same word cannot be added twice
        // the method works either way for word added first or translation added first
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word){
        //checking that the word is not found either as a key or a value (as a word or its translation)
        if(!this.dictionary.containsKey(word)){
            return null;
        }
        if(!this.dictionary.containsValue(word)){
            return null;
        }
        
        return this.dictionary.get(word);
    }

    // Part 2
    public void delete(String word){
        this.dictionary.remove(this.dictionary.get(word));
        this.dictionary.remove(word);
    }

    // Part 3
    public boolean load(){
        try (Scanner reader = new Scanner(Paths.get(fileName))){
            while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String firstWord = line.split(":")[0];
            String secondWord = line.split(":")[1];
            add(firstWord, secondWord);
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }

    // Part 4
    public boolean save(){
        try (PrintWriter writer = new PrintWriter(new FileWriter(this.fileName))) {
            // Found out that a Set is more preferable in this case https://www.baeldung.com/java-set-vs-list
            // Quote from source above: A List can contain duplicates, but a Set can’t
            Set<String> duplicateEntryList = new HashSet<>();

            for (String word : dictionary.keySet()) {
                String translation = dictionary.get(word);
                // Skip if the word or translation are found
                if (duplicateEntryList.contains(word) || duplicateEntryList.contains(translation)) {
                    continue;
                }

                writer.println(word + ":" + translation);
                duplicateEntryList.add(word);
                duplicateEntryList.add(translation);
            }

            return true;
            
        } catch (Exception e) {
            return false;
        }
    }
}


