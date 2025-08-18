# Java_MOOC

Some of the most relevant code produced while taking the Java programming MOOC (I and II) by the University of Helsinki.

All content uploaded to this repository comes from https://java-programming.mooc.fi/, however solutions to all problems are my own, and any solutions from the University of Helsinki have been adequately labelled as either 'Suggested answer' or 'Model answer'.

This course was heavily focused on the programming paradigm Object-Oriented Programming. Which is explained in the Java MOOC as follows:

"In object-oriented programming, information is represented as classes that describe the concepts of the problem domain and the logic of the application. Classes define the methods that determine how information is handled. During program execution, objects are instantiated from classes that contain runtime information and that also have an effect on program execution: program execution typically proceeds through a series of method calls related to the objects. As mentioned a few weeks ago, "the program is built from small, clear, and cooperative entities."

The basic ideas of object-oriented programming, i.e., the representation of information and its processing methods with he help of classes and objects, first appeared in Simula 67, which was designed for developing simulations and the Smalltalk programming language. Its breakthrough came in the 1980s through the C++ programming language and Java has made it one of the most widely used programming paradigms in the world.

One of the major benefits of object-oriented programming is how problem-domain concepts are modeled through classes and objects, which makes programs easier to understand. In addition, structuring the problem domain into classes facilitates the construction and maintenance of programs."

After doing my own research I came across the concept of the four pillars of OOP:

https://www.geeksforgeeks.org/java/four-main-object-oriented-programming-concepts-of-java/

and the concept of SOLID:

https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/

Extra notes linked to Java usage:
"At the start of the course, all of our methods included the static modifier, but when we started using objects, use of the static modifier was banned.

Methods in Java can be divided into two groups, based on whether they have the static modifier or not. Methods without the static modifier are instance methods. Methods with the static modifier are class methods

Instance methods are methods that are associated with an object, can process the objects variables and can call the object's other methods. Instance methods specifically CAN use the this modifier, which refers to the variables associated with the specific object, that is calling the instance method. Class methods can't use the this modifier, meaning that they can only access the variables they are given as parameters or that they create themselves.

In reality class methods can also access class variable, among other things. However, these things are outside the scope of this course."
