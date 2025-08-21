package JavaMOOC1.Part4.Exercise20;

public class Book {
    private String title;
    private int pages;
    private int publishedYear;

    public Book(String name, int numPages, int year) {
        this.title = name;
        this.pages = numPages;
        this.publishedYear = year;
    }

    public String getName() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.publishedYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publishedYear;
    }
}
