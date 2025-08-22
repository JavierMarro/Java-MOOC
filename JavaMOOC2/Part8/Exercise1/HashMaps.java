package JavaMOOC2.Part8.Exercise1;

import java.util.HashMap;
// Simple example and intro to HashMaps
public class HashMaps {

    public static void main(String[] args) {
        // Do the operations required here!

        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("Matthew", "Matt");
        nicknames.put("Michael", "Mix");
        nicknames.put("Arthur", "Artie");

        System.out.println(nicknames.get("Matthew"));

    }

}
