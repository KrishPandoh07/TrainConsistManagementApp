import java.util.Arrays;

/**
 * =========================================================
 * MAIN CLASS - UseCase17TrainConsistMgmt
 * =========================================================
 *
 * Use Case 17: Sort Bogie Names using Arrays.sort()
 */

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC17 - Sorting using Arrays.sort() ");
        System.out.println("========================================\n");

        // ===== ARRAY OF BOGIE NAMES =====
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // ===== SORT USING BUILT-IN METHOD =====
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\n========================================");
    }
}