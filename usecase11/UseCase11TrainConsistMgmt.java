import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * =========================================================
 * MAIN CLASS - UseCase11TrainConsistMgmt
 * =========================================================
 *
 * Use Case 11: Validate Train ID & Cargo Code using Regex
 */

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC11 - Regex Validation ");
        System.out.println("========================================\n");

        Scanner sc = new Scanner(System.in);

        // ===== INPUT =====
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // ===== REGEX PATTERNS =====
        String trainPatternStr = "TRN-\\d{4}";
        String cargoPatternStr = "PET-[A-Z]{2}";

        Pattern trainPattern = Pattern.compile(trainPatternStr);
        Pattern cargoPattern = Pattern.compile(cargoPatternStr);

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // ===== VALIDATION =====
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID ✅");
        } else {
            System.out.println("Invalid Train ID ❌");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code ✅");
        } else {
            System.out.println("Invalid Cargo Code ❌");
        }

        System.out.println("\n========================================");

        sc.close();
    }
}
