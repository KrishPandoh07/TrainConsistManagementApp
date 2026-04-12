import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * =========================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 */

public class UseCase1TrainConsistMgmt {

    // Train class to manage bogies
    static class Train {
        private List<String> bogies;

        public Train() {
            bogies = new ArrayList<>();
        }

        public int getBogieCount() {
            return bogies.size();
        }

        public void displayTrainState() {
            if (bogies.isEmpty()) {
                System.out.println("Train is currently empty. No bogies attached.");
            } else {
                System.out.println("Train Bogies: " + bogies);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App =====");

        // Step 1: Initialize Train
        Train train = new Train();

        // Step 2: Display initial bogie count
        System.out.println("Initial Bogie Count: " + train.getBogieCount());

        // Step 3: Display current train state
        train.displayTrainState();

        System.out.println("========================================");
    }
}