package JavaMOOC2.Part10.Exercise17ComplexInterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // test your code here (all code underneath given by UoH)
        // For part 1
        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // For part 2
        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        hand1.print();

        // For part 3
        Hand hand2 = new Hand();

        hand2.add(new Card(2, Suit.DIAMOND));
        hand2.add(new Card(14, Suit.SPADE));
        hand2.add(new Card(12, Suit.HEART));
        hand2.add(new Card(2, Suit.SPADE));

        hand2.sort();

        hand2.print();


        // For part 4
        Hand hand4 = new Hand();

        hand4.add(new Card(2, Suit.DIAMOND));
        hand4.add(new Card(14, Suit.SPADE));
        hand4.add(new Card(12, Suit.HEART));
        hand4.add(new Card(2, Suit.SPADE));

        Hand hand5 = new Hand();

        hand5.add(new Card(11, Suit.DIAMOND));
        hand5.add(new Card(11, Suit.SPADE));
        hand5.add(new Card(11, Suit.HEART));

        int comparison = hand4.compareTo(hand5);

        if (comparison < 0) {
            System.out.println("better hand is");
            hand5.print();
        } else if (comparison > 0){
            System.out.println("better hand is");
            hand4.print();
        } else {
            System.out.println("hands are equal");
        }

        // For part 5
        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(3, Suit.SPADE));
        cards.add(new Card(2, Suit.DIAMOND));
        cards.add(new Card(14, Suit.SPADE));
        cards.add(new Card(12, Suit.HEART));
        cards.add(new Card(2, Suit.SPADE));

        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
        Collections.sort(cards, sortBySuitSorter);

        cards.stream().forEach(c -> System.out.println(c));

        // For part 6
        Hand hand6 = new Hand();

        hand6.add(new Card(12, Suit.HEART));
        hand6.add(new Card(4, Suit.SPADE));
        hand6.add(new Card(2, Suit.DIAMOND));
        hand6.add(new Card(14, Suit.SPADE));
        hand6.add(new Card(7, Suit.HEART));
        hand6.add(new Card(2, Suit.SPADE));

        hand6.sortBySuit();

        hand6.print();
    }
}

