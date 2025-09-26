package JavaMOOC2.Part9.Exercise12ObjectPolymorphism;

public class Cat extends Animal {

    public Cat(){
        this("Cat");
    }
    public Cat(String name){
        super(name);
    }

    public void purr() {
    System.out.println(super.getName() + " purrs");
  }
    
}

