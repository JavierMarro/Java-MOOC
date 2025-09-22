package JavaMOOC2.Part9.Exercise4Abstract;


// fully written from scratch
public class MisplacingBox extends Box{

    // I had written all the code commented below but then realised that there is no need to keep track of the items misplaced and all tests passed.
    // Model answer by UoH contained the same implementation as I'd done.

    // private ArrayList<Item> randomList;

    // public MisplacingBox() {
    //     this.randomList = new ArrayList<>();
    // }

    @Override
    public void add(Item item) {
        // this.randomList.add(item);
    }

    @Override
    public boolean isInBox(Item item){
        return false;
    }
    
}

