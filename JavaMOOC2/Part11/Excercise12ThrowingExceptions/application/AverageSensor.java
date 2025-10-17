package JavaMOOC2.Part11.Excercise12ThrowingExceptions.application;

import java.util.ArrayList;
import java.util.List;
// Parts 3 and 4
public class AverageSensor implements Sensor{
    
    private List<Sensor> sensorList;
    private List<Integer> readingsList;

    public AverageSensor(){
        this.sensorList = new ArrayList<>();
        this.readingsList = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd){
        this.sensorList.add(toAdd);
    }

    public boolean isOn(){
        // decided to try with a lambda function and streams
        return this.sensorList.stream().allMatch(Sensor::isOn);
    }

    public void setOn(){
        for (Sensor sensor : this.sensorList) {
            sensor.setOn();
        }
    }

    public void setOff(){
        for (Sensor sensor : this.sensorList) {
            sensor.setOff();
        }
    }

    public int read(){
        if (this.sensorList.isEmpty() || !isOn()){
            throw new IllegalStateException("One or more sensors are not on, or there are no sensors in the list");
        }

        int total = 0;
        for (Sensor sensor : this.sensorList) {
            total+= sensor.read();
        }

        int avg = total / sensorList.size();
        this.readingsList.add(avg);
        return avg;
    }

    public List<Integer> readings(){
        return this.readingsList;
    }

    
}

