import java.util.HashSet;
import java.util.Set;

/**
 * =========================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * =========================================================
 *
 * Use Case 3: Track Unique Bogie IDs using HashSet
 */

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================\n");

        // Create HashSet to store unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (with duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display final set
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIDs);

        System.out.println("\nNote: Duplicate IDs are automatically removed!");

        System.out.println("\n========================================");
    }
}