package JavaMOOC2.Part12.Exercise1and2GenericTypes;

public class Hideout<T> {
    
    private T item;

    public Hideout(){
        // empty constructor needed for this generic typed class?
    }

    public void putIntoHideout(T toHide){
        // works as a setter
        this.item = toHide;
    }

    public T takeFromHideout(){
        if(this.item.equals(null)){
            return null;
        }
        // returns value in class
        T hiddenItem = this.item;
        // then empties the hideout
        this.item = null;
        return hiddenItem;
    }

    public boolean isInHideout(){
        // if the value of this class is null, then it's empty
        if(this.item.equals(null)){
            return false;
        }
        // otherwise it isn't empty
        return true;
    }

}

//Model answer
// public class Hideout<T> {
 
//     private T inHiding;
 
//     public void putIntoHideout(T toHide) {
//         this.inHiding = toHide;
//     }
 
//     public boolean isInHiding() {
//         return this.inHiding != null;
//     }
 
//     public T takeFromHideout() {
//         T previouslyInHiding = this.inHiding;
//         this.inHiding = null;
//         return previouslyInHiding;
//     }
// }
