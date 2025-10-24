package JavaMOOC2.Part12.Exercise6to8Randomness;

import java.util.ArrayList;

public class LotteryProgram {
    
    public static void main(String[] args) {
        // main program (by UoH)
        LotteryRow row = new LotteryRow();
        ArrayList<Integer> lotteryNumbers = row.numbers();

        System.out.println("Lottery numbers:");
        for (Integer number : lotteryNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
