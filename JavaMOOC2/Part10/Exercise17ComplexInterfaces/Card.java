package JavaMOOC2.Part10.Exercise17ComplexInterfaces;



public class Card implements Comparable<Card>{
    // code below provided by UoH
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        
        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    // Part 1 of the task: Implement method compareTo
    @Override
    public int compareTo(Card mockCard){
        //When values are equal, suit ordinals are compared
        // Since ordinal() returns a smaller number for earlier-declared suits (e.g. CLUB = 0, DIAMOND = 1, etc.)
        // this will naturally sort clubs before diamonds, hearts, and spades
        if(this.value == mockCard.value){
            return this.suit.ordinal() - mockCard.suit.ordinal();
        } 
        //If the values are different, this comparison orders cards by value ascending.
        return this.value - mockCard.value;
    }
    // In a more broken down way, the above could also be done as follows:
    // if (this.value == mockCard.getValue()) {
    // return this.suit.ordinal() - mockCard.getSuit().ordinal();
    // } else if (this.value < mockCard.getValue()) {
    //     return -1;
    // } else {
    //     return 1;
    // }

    
}

