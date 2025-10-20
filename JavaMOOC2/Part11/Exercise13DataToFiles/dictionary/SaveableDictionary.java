package JavaMOOC2.Part11.Exercise13DataToFiles.dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SaveableDictionary {
    // Part 1 + 3: Setting up the class, fields and constructor  
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

    // Part 1
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

// Part 2 Model answer
// public void delete(String word) {
//         String translation = translate(word);
 
//         words.remove(word);
//         words.remove(translation);
//     }

// Part 3 Model answer
// public boolean load() {
//         try {
//             Files.lines(Paths.get(this.file))
//                     .map(l -> l.split(":"))
//                     .forEach(parts -> {
//                         this.words.put(parts[0], parts[1]);
//                         this.words.put(parts[1], parts[0]);
//                     });
//             return true;
//         } catch (IOException ex) {
//             return false;
//         }
//     }

// Part 4 Model answer
// public boolean save() {
//         try {
//             PrintWriter writer = new PrintWriter(new File(file));
//             saveWords(writer);
//             writer.close();
//         } catch (Exception e) {
//             return false;
//         }
//         return true;
//     }

//     private void saveWords(PrintWriter writer) throws IOException {
//         List<String> allreadySaved = new ArrayList<>();
//         words.keySet().stream().forEach(word -> {
//             if (allreadySaved.contains(word)) {
//                 return;
//             }
 
//             String pari = word + ":" + words.get(word);
//             writer.println(pari);
 
//             allreadySaved.add(word);
//             allreadySaved.add(words.get(word));
//         });
//     }
