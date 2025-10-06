package JavaMOOC2.Part10.Exercise15SortMultipleCriteria;

public class Book {
    
    private String name;
    private int age;

    public Book(String title, int ageRange) {
        this.name = title;
        this.age = ageRange;
    }

    public int getAgeRange() {
        return this.age;
    }

    public String getTitle() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }

}
