## Question regarding data to file using PrintWriter / FileWriter:

**Familiarize yourself with the documentation on classes PrintWriter and FileWriter. Summarize shortly the differences between the two classes. Describe what they are meant for, and what they cannot be used to accomplish.**

For my answer, I read the docs at https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html & https://docs.oracle.com/javase/8/docs/api/java/io/FileWriter.html + found a really good answer via Baeldung https://www.baeldung.com/java-printwriter-filewriter-difference

Answer:
PrintWriter and FileWriter are both Java classes used for writing character data to files, but they serve different purposes.

- FileWriter is a basic writer that writes raw character streams directly to a file. It’s suitable for simple output tasks but lacks formatting options.
- PrintWriter, on the other hand, wraps around other writers like FileWriter and provides convenient methods such as print(), println(), and printf() for formatted text output. It also offers automatic flushing and error checking via checkError(). However, neither class supports writing binary data or complex file structures like JSON or XML without additional libraries.

### Instructions for the more important parts of Exercise 13 SaveableDictionary

##### Part 3: Reading from file

Make a constructor public SaveableDictionary(String file) and method public boolean load(), which loads the dictionary from the file given to the constructor as a parameter. If the program is unable to open the file or read from it, the method returns false, otherwise it returns true.

NB: the constructor only tells the dictionary the name of the file to load the dictionary from. The constructor does not read the file. Only the method load reads the file.
In the dictionary file, one line contains a word and its translation separated by ":". The exercise template contains a file words.txt which contains the following:
apina:monkey
alla oleva:below
olut:beer

Read the dictionary file line by line with the method nextLine. You can split a line using the String method split like so:

```java
Scanner fileReader = new ...
while (fileReader.hasNextLine()) {
    String line = fileReader.nextLine();
    String[] parts = line.split(":");   // split the line based on the ':' character

    System.out.println(parts[0]);     // part of line before :
    System.out.println(parts[1]);     // part of line after :
}
```

##### Part 4: Saving to a file

Create the method public boolean save(), which saves the dictionary to the file given to the dictionary as a parameter to the constructor. If the program cannot save to the file, the method returns false. Otherwise it returns true. The dictionary files have to be saved in the form described above, so the program can read the files it has written.

NB: Only the method save writes to the file.
NB: Even though the dictionary can translate both ways, the dictionary file should only contain one way. So if the dictionary, for example, knows that computer = tietokone, the file should contain:

Sample output
tietokone:computer

or

Sample output
computer:tietokone

but not both!

It is best to handle the saving to, such that the whole dictionary is written on top of the previously saved version, so it might not be the best to use the append method described in the material.

The final version of the dictionary works as follows:

```java
SaveableDictionary dictionary = new SaveableDictionary("words.txt");
dictionary.load();

// use the dictionary

dictionary.save();
```

In the beginning, the dictionary is loaded from a file, and, in the end, it is saved back to the file, so that changes made to the dictionary are kept for the next time the dictionary is used.
