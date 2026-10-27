
public class Main {
    public static void main(String[] args) {
        SimpleHashtable hashtable = new SimpleHashtable();

        Player player1 = new Player(1, "Lumi", 500);
        Player player2 = new Player(2, "Matthias", 999);
        Player player3 = new Player(3, "Lukas", 100);
        Player player4 = new Player(4, "Emil", 200);

        hashtable.put("Lumi", player1);
        hashtable.put("Matthias", player2);
        hashtable.put("Lukas", player3);
        hashtable.put("Emil", player4);

        System.out.println("Original Hashtable:");
        hashtable.printHashtable();

        System.out.println("\nGetting player: "
                + hashtable.get("Lukas"));

        System.out.println("\nRemoving player: "
                + hashtable.remove("Lukas"));

        System.out.println("\nHashtable after removal:");
        hashtable.printHashtable();

        System.out.println("\nSearching for removed player: "
                + hashtable.get("Lukas"));

        System.out.println("\nSearching for remaining player: "
                + hashtable.get("Emil"));
    }
}
