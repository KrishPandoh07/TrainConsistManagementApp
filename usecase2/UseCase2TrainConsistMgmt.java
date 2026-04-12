import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * =========================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 */

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("========================================\n");

        // Create ArrayList to store passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ===== CREATE (Add bogies) =====
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // ===== DELETE (Remove bogie) =====
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // ===== READ (Check existence) =====
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie exists in the train.");
        } else {
            System.out.println("\n'Sleeper' bogie does NOT exist.");
        }

        // ===== FINAL STATE =====
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);

        System.out.println("\n========================================");
    }
}