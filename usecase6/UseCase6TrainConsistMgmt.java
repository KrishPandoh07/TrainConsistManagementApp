import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * =========================================================
 *
 * Use Case 6: Map Bogie to Capacity using HashMap
 */

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC6 - Bogie Capacity Mapping ");
        System.out.println("========================================\n");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ===== INSERT DATA =====
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // ===== DISPLAY USING entrySet =====
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                               " | Capacity: " + entry.getValue());
        }

        System.out.println("\n========================================");
    }
}