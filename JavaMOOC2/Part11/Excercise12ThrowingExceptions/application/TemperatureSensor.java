package JavaMOOC2.Part11.Excercise12ThrowingExceptions.application;

import java.util.Random;
// Part 2
public class TemperatureSensor implements Sensor{
    
    private boolean on;
    
    public TemperatureSensor(){
        this.on = false;
    }

    public boolean isOn(){
        return this.on;
    }

    public int read(){
        if (!this.on){
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30; // Range: -30 to 30
    }

    public void setOn(){
        this.on = true;
    }

    public void setOff(){
        this.on = false;
    }
}

