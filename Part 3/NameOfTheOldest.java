
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldie = "";
        int oldest = 0;

        while (true){

            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            if (Integer.valueOf(data[1]) > oldest) {
                oldest = Integer.valueOf(data[1]);
                oldie += String.valueOf(data[0]);
            }
        }
        
        System.out.println("Name of the oldest: " + oldie);
    }
}

