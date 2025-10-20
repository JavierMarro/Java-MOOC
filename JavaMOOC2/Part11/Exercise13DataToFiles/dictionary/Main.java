package JavaMOOC2.Part11.Exercise13DataToFiles.dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here (code by UoH)
        // Part 1
        SaveableDictionary dictionary = new SaveableDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("apina", "apfe");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("banana"));

        // Part 2
        SaveableDictionary sanakirja = new SaveableDictionary();
        sanakirja.add("apina", "monkey");
        sanakirja.add("banaani", "banana");
        sanakirja.add("ohjelmointi", "programming");
        sanakirja.delete("apina");
        sanakirja.delete("banana");

        System.out.println(sanakirja.translate("apina"));
        System.out.println(sanakirja.translate("monkey"));
        System.out.println(sanakirja.translate("banana"));
        System.out.println(sanakirja.translate("banaani"));
        System.out.println(sanakirja.translate("ohjelmointi"));

        // Part 3
        SaveableDictionary dizionario = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dizionario.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dizionario.translate("apina"));
        System.out.println(dizionario.translate("ohjelmointi"));
        System.out.println(dizionario.translate("alla oleva"));

        // Part 4
        SaveableDictionary diccionario = new SaveableDictionary("words.txt");
        diccionario.load();

        // use the dictionary

        diccionario.save();
    }
}

