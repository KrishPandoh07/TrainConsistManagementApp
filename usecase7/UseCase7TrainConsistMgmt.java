import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase7TrainConsistMgmt
 * =========================================================
 *
 * Use Case 7: Sort Bogies by Capacity using Comparator
 */

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class UseCase7TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("========================================\n");

        // Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ===== SORT USING COMPARATOR =====
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\n========================================");
    }
}