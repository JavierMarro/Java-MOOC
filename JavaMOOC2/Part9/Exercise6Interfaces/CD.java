package JavaMOOC2.Part9.Exercise6Interfaces;

public class CD implements Packable{
    
    private String singer;
    private String album;
    private int year;
    private double weight;

    public CD(String artist, String cdTitle, int year){
        this.singer = artist;
        this.album = cdTitle;
        this.year = year;
        this.weight = 0.1;
    }

    @Override
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return this.singer + ": " + this.album + " (" + this.year + ")";
    }

}
