package JavaMOOC1.Part5.Exercise17;


public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    // My solution below to the methods asked for at problem set 17
    public Money plus(Money addition) {
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } 
        
        if (this.euros == compared.euros && this.cents > compared.cents) {
            return false;
        }

        return true;
    }
    
    public Money minus(Money decreaser) {
        int newE = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
        if (newCents < 0) {
            newE--;
            newCents = 100 + newCents;
        }
        if (newE < 0) {
            newE = 0;
            newCents = 0;
        }
        Money newMoney = new Money(newE, newCents);
        return newMoney;
    }

}

// Model answer
// public Money plus(Money addition) {
//         int euros = this.euros + addition.euros();
//         int cents = this.cents + addition.cents();
 
//         if (cents > 99) {
//             cents = cents - 100;
//             euros = euros + 1;
//         }
 
//         return new Money(euros, cents);
//     }
 
//     public boolean lessThan(Money compared) {
//         return (100 * this.euros + this.cents) < (100 * compared.euros() + compared.cents());
//     }
 
//     public Money minus(Money decreaser) {
//         int euros = this.euros - decreaser.euros();
//         int cents = this.cents - decreaser.cents();
 
//         if (cents < 0) {
//             cents = cents + 100;
//             euros = euros - 1;
//         }
 
//         // if the value becomes negative, return zero
//         if (euros < 0) {
//             return new Money(0, 0);
//         }
 
//         return new Money(euros, cents);
//     }