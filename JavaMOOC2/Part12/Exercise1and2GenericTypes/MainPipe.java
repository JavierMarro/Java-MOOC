package JavaMOOC2.Part12.Exercise1and2GenericTypes;

import java.util.Scanner;

public class MainPipe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here (by UoH)
        SimplePipe<String> pipe = new SimplePipe<>();
        pipe.putIntoPipe("dibi");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("daa");
        while(pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }

        SimplePipe<Integer> numberPipe = new SimplePipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
    }
}
