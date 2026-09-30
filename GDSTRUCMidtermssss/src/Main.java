import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardStack playerDeck = new CardStack(30);
        CardStack playerHand = new CardStack(10);
        CardStack discardPile = new CardStack(10);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 30; i++) {
            playerDeck.push(new Card("Card " + i));
        }

        while (!playerDeck.isEmpty()) {
            int command = random.nextInt(3);

            int x = random.nextInt(5) + 1;

            if (command == 0) {
                System.out.println("Draw " + x + " cards");

                for (int i = 0; i < x && !playerDeck.isEmpty(); i++) {
                    playerHand.push(playerDeck.pop());
                }

            } else if (command == 1) {
                System.out.println("Discard " + x + " cards");

                for (int i = 0; i < x && !playerHand.isEmpty(); i++) {
                    discardPile.push(playerHand.pop());
                }

            } else {
                System.out.println("Get " + x + " cards from discarded pile");

                for (int i = 0; i < x && !discardPile.isEmpty(); i++) {
                    playerHand.push(discardPile.pop());
                }
            }

            System.out.println("\nPlayer Hand:");
            playerHand.printStack();

            System.out.println("\nRemaining cards: " + playerDeck.size());

            System.out.println("Cards in Discard Pile: " + discardPile.size());

            if (!playerDeck.isEmpty()) {
                System.out.println("\nPress ENTER to continue.");
                scanner.nextLine();
            }
        }

        System.out.println("\nYour deck is empty.");
        System.out.println("\n\nGAME OVER.");
    }
}