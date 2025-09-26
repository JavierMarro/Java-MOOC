package JavaMOOC2.Part9.Exercise12ObjectPolymorphism;

public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here (by UoH)
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        NoiseCapable puppy = new Dog();
        puppy.makeNoise();

        NoiseCapable kitten = new Cat("Garfield");
        kitten.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }
}
