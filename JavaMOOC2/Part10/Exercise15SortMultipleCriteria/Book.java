package JavaMOOC2.Part10.Exercise15SortMultipleCriteria;

public class Book {

    private String title;
    private int age;

    public Book(String bookName, int ageRating) {
        this.title = bookName;
        this.age = ageRating;
    }

    public String getTitle() {
        return this.title;
    }

    public int getAgeRating() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.title + " (recommended for " + this.age + " year-olds or older)";
    } 
    
}
