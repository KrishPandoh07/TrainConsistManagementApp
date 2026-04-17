import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase10TrainConsistMgmt
 * =========================================================
 *
 * Use Case 10: Count Total Seats using reduce()
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

public class UseCase10TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC10 - Total Train Capacity ");
        System.out.println("========================================\n");

        // ===== CREATE LIST =====
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // ===== STREAM + REDUCE =====
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // ===== DISPLAY =====
        System.out.println("Total Seating Capacity: " + totalCapacity);

        System.out.println("\n========================================");
    }
}