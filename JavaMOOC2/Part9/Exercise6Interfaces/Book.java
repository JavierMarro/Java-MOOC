package JavaMOOC2.Part9.Exercise6Interfaces;

public class Book implements Packable{
    
    private String writer;
    private String title;
    private double weight;

    public Book(String author, String bookTitle, double weight){
        this.writer = author;
        this.title = bookTitle;
        this.weight = weight;
    }

    @Override
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return this.writer + ": " + this.title;
    }
}
