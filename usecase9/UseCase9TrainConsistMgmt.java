import java.util.*;
import java.util.stream.Collectors;

/**
 * =========================================================
 * MAIN CLASS - UseCase9TrainConsistMgmt
 * =========================================================
 *
 * Use Case 9: Group Bogies by Type using Streams
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
        return name + " (" + capacity + ")";
    }
}

public class UseCase9TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC9 - Group Bogies using Streams ");
        System.out.println("========================================\n");

        // ===== CREATE LIST =====
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72)); // duplicate type
        bogies.add(new Bogie("First Class", 40));

        // ===== GROUPING =====
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                      .collect(Collectors.groupingBy(b -> b.name));

        // ===== DISPLAY =====
        System.out.println("Grouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n========================================");
    }
}