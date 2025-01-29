//Name: Viet Trinh Nguyen
//Date: 1/28/25
//CS 240
// Programming Assignment1: War Card Game
// Description : Making Game
import java.util.*;

public class Deck {
    // a list to store the cards in the deck
    private List<Card> cards;

    public Deck() {
        //Create suits and ranks
        cards = new ArrayList<>();
        //define suits
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        //define ranks
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        //create 52 cards in the deck
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(suit, ranks[i], values[i]));
            }
        }
    }

    // method to remove and return the top card from the deck
    public Card drawCard() {
        return cards.isEmpty() ? null : cards.remove(0);
    }

    // Method to shuffle the deck randomly
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}

