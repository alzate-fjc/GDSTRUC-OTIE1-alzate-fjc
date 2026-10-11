
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int gameCount = 0;
        int playerId = 1;

        while (gameCount < 10) {
            int x = random.nextInt(7) + 1;

            System.out.println("Start matchmaking!!!");
            System.out.println("...Enqueuing " + x + " player(s)...");

            for (int i = 0; i < x; i++) {
                Player player = new Player(
                        playerId,
                        "Player " + playerId,
                        random.nextInt(1000) + 1
                );

                queue.enqueue(player);
                playerId++;
            }

            System.out.println("\nCurrent matchmaking queue:");
            queue.printQueue();

            while (queue.size() >= 5 && gameCount < 10) {
                gameCount++;

                System.out.println("\nGame " + gameCount + " started!");
                System.out.println("Matched players:");

                for (int i = 0; i < 5; i++) {
                    System.out.println(" -> " + queue.dequeue());
                }

                System.out.println("Game " + gameCount + " successfully formed!");
            }

            System.out.println("\nPlayers in queue: " + queue.size());

            if (gameCount < 10) {
                System.out.println("\nPress ENTER to end this turn.");
                scanner.nextLine();
            }
        }

        System.out.println("10 games have been successfully formed!");
        System.out.println("Matchmaking terminated.");

        scanner.close();
    }
}
