package JavaMOOC2.Part9.Exercise4Abstract;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    // code above given by UoH, code below written by me as solution
    @Override
    public boolean equals(Object object) {

        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }

        final Item newItem = (Item) object;
        if (!this.name.equals(newItem.name)) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
    
        return this.name.hashCode() * 19;
    }
    // other option
    // public int hashCode() {
    // return Objects.hash(this.name);
    // }
}

