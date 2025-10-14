package JavaMOOC2.Part11.Exercise9AnalysingOthersCode.flightControl.domain;
// code part of the notes provided in Part 11, Java MOOC II
public class Place {

    private String ID;

    public Place(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return this.ID;
    }
}
