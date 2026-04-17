import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase18TrainConsistMgmt
 * =========================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 */

public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC18 - Linear Search ");
        System.out.println("========================================\n");

        // ===== ARRAY OF BOGIE IDs =====
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        // ===== INPUT SEARCH KEY =====
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        boolean found = false;

        // ===== LINEAR SEARCH =====
        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                found = true;
                break; // stop when found
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