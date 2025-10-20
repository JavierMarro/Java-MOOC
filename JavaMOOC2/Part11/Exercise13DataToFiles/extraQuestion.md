## Question regarding data to file using PrintWriter / FileWriter:

**Familiarize yourself with the documentation on classes PrintWriter and FileWriter. Summarize shortly the differences between the two classes. Describe what they are meant for, and what they cannot be used to accomplish.**

For my answer, I read the docs at https://docs.oracle.com/javase/8/docs/api/java/io/PrintWriter.html & https://docs.oracle.com/javase/8/docs/api/java/io/FileWriter.html + found a really good answer via Baeldung https://www.baeldung.com/java-printwriter-filewriter-difference

Answer:
PrintWriter and FileWriter are both Java classes used for writing character data to files, but they serve different purposes.

- FileWriter is a basic writer that writes raw character streams directly to a file. It’s suitable for simple output tasks but lacks formatting options.
- PrintWriter, on the other hand, wraps around other writers like FileWriter and provides convenient methods such as print(), println(), and printf() for formatted text output. It also offers automatic flushing and error checking via checkError(). However, neither class supports writing binary data or complex file structures like JSON or XML without additional libraries.
