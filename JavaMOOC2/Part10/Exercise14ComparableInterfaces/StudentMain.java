package JavaMOOC2.Part10.Exercise14ComparableInterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

    public static void main(String[] args) {
        // My implementation to test the method
        Student first = new Student("jamo");
        Student second = new Student("jamol");
        Student third = new Student("jamolian");
        Student fourth = new Student("jamolin");
        System.out.println(first.compareTo(second));

        ArrayList<Student> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);
        students.add(fourth);

        System.out.println(students);
        System.out.println();

        Collections.sort(students);
        System.out.println(students);
    }
}

