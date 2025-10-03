package JavaMOOC2.Part10.Exercise14ComparableInterfaces;


public class Human implements Comparable<Human>{

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    // My solution below
    @Override
    public int compareTo(Human human){
        if (this.wage == human.getWage()){
            return 0;
        } else if (this.wage < human.getWage()){
            return 1;
        } else {
            return -1;
        }
        // the above can be refactored/also implemented as follows
        // As returning a negative number from compareTo() is enough if the this object is smaller than the parameter object
        // and returning zero is sufficient when the lengths are the same:
        // return human.getWage() - this.wage;
    }

}

