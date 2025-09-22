package JavaMOOC2.Part9.Exercise2Superclass;

public class Teacher extends Person{

    private int wage;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.wage = salary;
    }

    public int salary(){
        return this.wage;
    }

    @Override
    public String toString(){
        return super.toString() + "\n  salary " + this.salary() + " euro/month";
    }
    
}

