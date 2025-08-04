import java.util.ArrayList;

public class Main {

    // ✅ This is your reusable method (outside main, still inside the class)
    public static void printWatchlist(ArrayList<String> list) {
        System.out.println("\n--- My Watchlist ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    // ✅ This is your main method
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();

        movies.add("Interstellar");
        movies.add("The Batman");
        movies.add("Spider-Man: Across the Spider-Verse");

        // 👇 Replace your old for loop with this line:
        printWatchlist(movies);
    }
}