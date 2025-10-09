package JavaMOOC2.Part10.Exercise16Enumclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    private List<Person> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employeeList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        for (Person person : peopleToAdd){
            this.add(person);
        }
    }
    //Model answer
    // public void add(List<Person> peopleToAdd) {
    //     peopleToAdd.stream().forEach(person -> Employees.this.add(person));
    // }

    public void fire(Education education){
        Iterator<Person> iterator = employeeList.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if(nextInLine.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }

    public void print() {
        for (Person employee : employeeList){
            System.out.println(employee);
        }
    }

    public void print(Education education){
        Iterator<Person> iterator = employeeList.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if(nextInLine.getEducation().equals(education)){
                System.out.println(nextInLine);
            }
        }
    }
}

