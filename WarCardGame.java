//Name: Viet Trinh Nguyen
//Date: 1/28/25
//CS 240
// Programming Assignment1: War Card Game
// Description : Making Game
import java.util.*;

public class WarCardGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Create deck object and shuffle the card
        Deck deck = new Deck();
        deck.shuffleDeck();
        
        // Split the deck 
        Queue<Card> playerA = new LinkedList<>();
        Queue<Card> playerB = new LinkedList<>();       
        // Deal cards
        for (int i = 0; i < 26; i++) {
            playerA.add(deck.drawCard());
            playerB.add(deck.drawCard());
        }

        // Game loop
        while (!playerA.isEmpty() && !playerB.isEmpty()) {
            System.out.println("Press to play!!!");
            in.nextLine();
            
            // Each player draws a card
            Card playerACard = playerA.poll();
            Card playerBCard = playerB.poll();
            
            System.out.println("It's A turn: " + playerACard);
            System.out.println("It's B turn: " + playerBCard);

            // Compare the cards
            if (playerACard.getValue() > playerBCard.getValue()) {
                System.out.println("Player A wins this round!");
                playerA.add(playerACard);
                playerB.add(playerBCard);
            } else if (playerBCard.getValue() > playerACard.getValue()) {
                System.out.println("Player B wins this round!");
                playerB.add(playerACard);
                playerB.add(playerBCard);
            } else {
                // both card are equal
                System.out.println("It's a tie!");
            
            }

            System.out.println("Player A has " + playerA.size() + " cards left.");
            System.out.println("Player B has " + playerB.size() + " cards left.");
        }
        //loop ends, determine who the winner is
        if (playerA.isEmpty()) {
            System.out.println("Player A! You're win");
        } else {
            System.out.println("Player B! You're win");
        }
        in.close();
    }
}
