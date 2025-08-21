package JavaMOOC1.part7.Exercise1;

public class Container {
    
    private int total;

    public Container(){
        this.total = 0;
    }

    public int contains(){
        return total;
    }

    public void add(int amount){
        if(this.total + amount >= 101){
            this.total = 100;
        } else if (amount > 0) {
            this.total = this.total + amount;
        }
    }

    public void remove(int amount){
        if (amount > this.total){
            this.total = 0;
        } else {
            this.total-= amount;
        }
    }

    public String toString(){
        return this.total + "/100";
    }
}

