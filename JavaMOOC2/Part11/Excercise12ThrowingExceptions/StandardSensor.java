package JavaMOOC2.Part11.Excercise12ThrowingExceptions;

package application;
// Part 1
public class StandardSensor implements Sensor{
    
    private int minutes;

    public StandardSensor(int minutes){
        //code below not needed but added to practise a different type of thrown exception
        if(minutes < -60 || minutes > 60){
            throw new IllegalArgumentException();
        }

        this.minutes = minutes;
    }

    public boolean isOn(){
        return true;
    }

    public int read(){
        return this.minutes;
    }

    public void setOn(){

    }

    public void setOff(){

    }
}

