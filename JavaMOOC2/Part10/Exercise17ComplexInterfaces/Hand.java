package JavaMOOC2.Part10.Exercise17ComplexInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Part 2, solution to creating Hand class with first 2 methods
public class Hand implements Comparable<Hand> {

  private List<Card> cardsHand;

  public Hand(){
    this.cardsHand = new ArrayList<>();
  }

  public void add(Card card){
    this.cardsHand.add(card);
  }

  public void print(){
    this.cardsHand.forEach(card -> System.out.println(card));
    // the above using a lambda expression
    // this.cardsHand.forEach(System.out::println);
  }

  //Part 3, method sort
  public void sort(){
    Collections.sort(this.cardsHand);
  }
  
  //Part 4, method compareTo
  @Override
  public int compareTo(Hand mockHand){
    return this.sum() - mockHand.sum();
  }
  // As I need the total value of the array of cards in a Hand it is better to extract and implement a method to add all values
  // Industry standards: clean and reusable code
  public int sum(){
    int handTotal = 0;
    for (Card card : this.cardsHand){
      handTotal+= card.getValue();
    }
    return handTotal;
  }

  // Part 6 Sorting the hand by suit
  public void sortBySuit(){
    Collections.sort(this.cardsHand, new BySuitInValueOrder());
  }
}
