package JavaMOOC2.Part10.Exercise14ComparableInterfaces;

// Task instructions:
// The exercise template includes the class Student, which has a name. 
// Implement the Comparable interface in the Student class in a way, such that the compareTo method sorts the students in alphabetical order based on their names.
// The name of the Student is a String, which implements Comparable itself. 
// You may use its compareTo method when implementing the method for the Student class. 
// Note that String.compareTo() also treats letters according to their size, while the compareToIgnoreCase method of the same class ignores the capitalization completely. 
// You may use either of these methods in the exercise.

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    // My solution below
    @Override
    public int compareTo(Student student){
        return this.name.compareToIgnoreCase(student.getName());
    }
    // Model answer
    // public int compareTo(Student another) {
    //     return this.getName().compareTo(another.getName());
    // }

}


