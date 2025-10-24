package JavaMOOC2.Part12.Exercise6to8Randomness;


public class DieProgram {

    public static void main(String[] args) {
        // main program (by UoH)
        Die die6 = new Die(6);

        int index = 0;
        while (index < 10) {
            System.out.println(die6.throwDie());
            index++;
        }

        Die die12 = new Die(12);

        for (int i = 0; i < 10; i++) {
            System.out.println(die12.throwDie());
        }

    }
}

