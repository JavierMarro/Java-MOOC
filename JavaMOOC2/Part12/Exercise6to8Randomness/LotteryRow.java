package JavaMOOC2.Part12.Exercise6to8Randomness;


import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Task: Implement the random number generation here the method containsNumber is probably useful
        Random randomizer = new Random();
        for(int i = 0; i < 41; i++){
            int randomPick = randomizer.nextInt(40) + 1; // the +1 sets the initial index to 1 rather than 0 in the bounded nextInt(40)
            boolean alreadyInList = this.containsNumber(randomPick);
            if(!alreadyInList) this.numbers.add(randomPick);
            if(this.numbers.size() == 7) break;
        }
    }

    public boolean containsNumber(int number) {
        // Task: Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}

// Model answer
// public void randomizeNumbers() {
         
//         this.numbers = new ArrayList<>();
//         Random random = new Random();
 
//         while (this.numbers.size() < 7) {
//             int newNumber = random.nextInt(40) + 1;
//             boolean numberWasAlreadyDrawn = this.containsNumber(newNumber);
 
//             // Only add the new number if it was not already drawn
//             if (!numberWasAlreadyDrawn) {
//                 this.numbers.add(newNumber);
//             }
//         }
//     }


