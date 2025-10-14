package JavaMOOC2.Part11.Exercise9AnalysingOthersCode.flightControl.domain;
// code part of the notes provided in Part 11, Java MOOC II
public class Airplane {

    private String id;
    private int capacity;

    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getID() {
        return this.id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " capacity)";
    }
}
