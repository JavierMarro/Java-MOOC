package JavaMOOC1.Part6.Exercise10;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    private ArrayList<String> taskList;

    public TodoList(){
        this.taskList = new ArrayList<>();
    }

    public void add(String task){
        this.taskList.add(task);
    }

    public void print(){
        for (int i = 0; i < this.taskList.size(); i++){
            System.out.println((i + 1) + ": " + this.taskList.get(i));
        }
    }

    public void remove(int number){
        this.taskList.remove(number - 1);
    }
}

