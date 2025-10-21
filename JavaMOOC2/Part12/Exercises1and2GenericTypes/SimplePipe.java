package JavaMOOC2.Part12.Exercises1and2GenericTypes;

import java.util.ArrayList;
import java.util.List;

public class SimplePipe<T>{
    
    private List<T> values;

    public SimplePipe(){
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.values.add(value);
    }

    public T takeFromPipe(){
        if(this.values.isEmpty()) return null;

        T oldestValue = this.values.remove(0);
        
        return oldestValue;
    }

    public boolean isInPipe(){
        
        return this.values.size() == 0 ? false : true;
        //Model answer:
        // return !this.values.isEmpty();
    }
}

