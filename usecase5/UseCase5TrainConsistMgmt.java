import java.util.LinkedHashSet;
import java.util.Set;

/**
 * =========================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * =========================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 */

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Order with Uniqueness ");
        System.out.println("========================================\n");

        // Create LinkedHashSet for train formation
        Set<String> train = new LinkedHashSet<>();

        // ===== ADD BOGIES =====
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate intentionally
        train.add("Sleeper"); // will be ignored

        // ===== DISPLAY FORMATION =====
        System.out.println("Final Train Formation (Ordered & Unique):");
        System.out.println(train);

        System.out.println("\nNote: Duplicate 'Sleeper' was ignored automatically.");

        System.out.println("\n========================================");
    }
}