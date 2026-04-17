import java.util.Arrays;
import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase20TrainConsistMgmt
 * =========================================================
 *
 * Use Case 20: Exception Handling During Search Operations
 */

public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC20 - Fail-Fast Search ");
        System.out.println("========================================\n");

        // ===== ARRAY (try empty case also) =====
        String[] bogieIDs = {};   // EMPTY ARRAY

        // ===== VALIDATION (FAIL-FAST) =====
        if (bogieIDs.length == 0) {
            throw new IllegalStateException("No bogies available for search!");
        }

        // ===== SORT =====
        Arrays.sort(bogieIDs);

        Scanner sc = new Scanner(System.in);

        // ===== INPUT =====
        System.out.print("Enter Bogie ID to search: ");
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
                high = mid - 1;
            } else {
                low = mid + 1;
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