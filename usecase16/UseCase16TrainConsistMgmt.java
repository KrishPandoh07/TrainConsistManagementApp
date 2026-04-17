/**
 * =========================================================
 * MAIN CLASS - UseCase16TrainConsistMgmt
 * =========================================================
 *
 * Use Case 16: Sort Passenger Bogies using Bubble Sort
 */

public class UseCase16TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC16 - Bubble Sort (Manual Sorting) ");
        System.out.println("========================================\n");

        // ===== ARRAY OF CAPACITIES =====
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        printArray(capacities);

        // ===== BUBBLE SORT =====
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");
        printArray(capacities);

        System.out.println("\n========================================");
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}