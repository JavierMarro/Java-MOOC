package JavaMOOCI.Part6.Exercise13.src.main.java;

import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }

        return list;
    }
        
    public void add(String exercise) {
        this.exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise task : exercises) {
            if (task.getName().equals(exercise)) {
                task.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise task : exercises) {
            if (task.getName().equals(exercise)) {
                return task.isCompleted();
            }
        }
        return false;
    }

}
