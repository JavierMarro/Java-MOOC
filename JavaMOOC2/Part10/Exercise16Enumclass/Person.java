package JavaMOOC2.Part10.Exercise16Enumclass;

public class Person {
    
    private String name;
    private Education qualification;

    public Person(String firstName, Education education) {
        this.name = firstName;
        this.qualification = education;
    }

    public Education getEducation() {
        return qualification;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", " + qualification;
    }

}

