package JavaMOOC2.Part10.Exercise17ComplexInterfaces;

import java.util.Comparator;
// Part 5, partially given by UoH, see comments below
public class BySuitInValueOrder implements Comparator<Card> {
    
    public int compare(Card c1, Card c2) {
    int comparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();

    if (comparison == 0) {
      return c1.getValue() - c2.getValue();
    }
    return comparison;

  }

}

// Alternative sorting systems are possible through different sorting classes. Such a class must have the Comparator<Card> interface. 
// An object of the sorting class will then compare two cards give as parameters. 
// The class only has one method, compare(Card c1, Card c2), which:
// 1. returns a negative value if the card c1 should be sorted before card c2
// 2. a positive value if card c2 comes before card c1
// 3. zero if they are equal.
// The idea is to create a different sorting class for each different way of sorting the cards, e.g. cards of the same suit in a row:
// import java.util.Comparator;

// public class SortBySuit implements Comparator<Card> {
//     public int compare(Card c1, Card c2) {
//         return c1.getSuit().ordinal() - c2.getSuit().ordinal();
//     }
// }

// Sorting still works with the sort method of Collections class. As its other parameter, the method now receives the object that has the sorting logic.
