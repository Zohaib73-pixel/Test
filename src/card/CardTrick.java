/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author mohammadzohaibsiddiuqi_991776343
 */
import java.util.Scanner;
import java.util.Random;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random randNum = new Random();
        Scanner inp = new Scanner(System.in);

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(randNum.nextInt(13) + 1); // 1 to 13
            c.setSuit(Card.SUITS[randNum.nextInt(4)]); // Random suit
            magicHand[i] = c;
        }

        // Ask user to pick a card
        System.out.print("Pick a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = inp.nextLine();

        System.out.print("Enter the value (1 - 13): ");
        int userValue = inp.nextInt();

        Card choosenCard = new Card();
        choosenCard.setSuit(userSuit);
        choosenCard.setValue(userValue);

        // Search magicHand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == choosenCard.getValue() &&
                card.getSuit().equalsIgnoreCase(choosenCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report result
        if (found) {
            System.out.println("Congrat! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, Your card was not a magic card.");
        }
        System.out.println("\nYour card: " + choosenCard.getSuit());
        
        // Adding one lucky card: 2 of Clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");
        System.out.println("\n(Lucky card was: " + luckyCard.getSuit() + ")");

        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() &&
                card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        //After pushing and commiting changes result code
        

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        if (found) {
            System.out.println("Congrat! Your card is  the Lucky Card!");
        } else {
            System.out.println("Sorry, Your card was not a Lucky Card.");
        }
        System.out.println("\nYour card: " + luckyCard.getSuit());
    }
}
