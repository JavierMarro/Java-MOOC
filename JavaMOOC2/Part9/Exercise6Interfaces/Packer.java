package JavaMOOC2.Part9.Exercise6Interfaces;

// This is code given by UoH as part of the course on how to use interfaces as return types in methods (2)

public class Packer {
    
    private Factory factory;

    public Packer() {
        this.factory = new Factory();
    }

    public Box giveABoxOfThings() {
         Box box = new Box(100);

         int i = 0;
         while (i < 10) {
             Packable newThing = factory.produceNew();
             box.add(newThing);

             i = i + 1;
         }

         return box;
    }

}
