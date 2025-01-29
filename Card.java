//Name: Viet Trinh Nguyen
//Date: 1/28/25
//CS 240
// Programming Assignment1: War Card Game
// Description : Making Game
public class Card { 
    private String suit;
    private String rank;
    private int value;

    //Constructor to initialize a card object
    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    //Getter method to retrive the value of the card
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}


