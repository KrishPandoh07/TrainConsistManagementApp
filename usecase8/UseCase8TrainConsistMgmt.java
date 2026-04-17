import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS - UseCase8TrainConsistMgmt
 * =========================================================
 *
 * Use Case 8: Filter Passenger Bogies using Streams
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

public class UseCase8TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC8 - Filter Bogies using Streams ");
        System.out.println("========================================\n");

        // ===== CREATE LIST (same as UC7) =====
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Original Bogies:");
        bogies.forEach(System.out::println);

        // ===== STREAM FILTER =====
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // ===== DISPLAY FILTERED =====
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\n========================================");
    }
}