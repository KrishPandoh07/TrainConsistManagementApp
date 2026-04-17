import java.util.Arrays;
import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase19TrainConsistMgmt
 * =========================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 */

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC19 - Binary Search ");
        System.out.println("========================================\n");

        // ===== ARRAY (can be unsorted) =====
        String[] bogieIDs = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // ===== SORT FIRST (IMPORTANT) =====
        Arrays.sort(bogieIDs);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        Scanner sc = new Scanner(System.in);

        // ===== INPUT =====
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // ===== BINARY SEARCH =====
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIDs[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1;  // search right
            }
        }

        // ===== OUTPUT =====
        if (found) {
            System.out.println("Bogie ID found ✅");
        } else {
            System.out.println("Bogie ID not found ❌");
        }

        System.out.println("\n========================================");

        sc.close();
    }
}