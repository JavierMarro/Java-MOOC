package JavaMOOC2.Part9.Exercise2;

public class Person {
    
    private String name;
    private String address;

    public Person(String person, String fullAddress) {
        this.name = person;
        this.address = fullAddress;
    }

    @Override
    public String toString() {
        return this.name + "\n" + "  " + this.address;
    }
}

