package JavaMOOC1.Part6.Exercise8;

//All code below produced by me
public class Item {
    
    private String name;
    private int weight;

    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }
}

