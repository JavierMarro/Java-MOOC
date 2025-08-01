package JavaMOOCI.Part6.Exercise10;
import java.util.Scanner;

    public class UserInterface {
    private Scanner scanner;
    private TodoList tasks;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.scanner = scanner;
        this.tasks = tasks;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } 
            
            if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                this.tasks.add(task);
            } else if (command.equals("list")) {
                tasks.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                this.tasks.remove(index);
            }
        }
    }
}

