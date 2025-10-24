package JavaMOOC2.Part12.Excercise6to8Randomness;

import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        // This initialises the value of numberOfFaces
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDie() {
        // This generates a random number which may be any number between one and the number of faces, and then return it
        int randomNum = random.nextInt(numberOfFaces) + 1;
        return randomNum;
    }
}

