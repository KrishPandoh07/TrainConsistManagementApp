import java.util.LinkedList;

/**
 * =========================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * =========================================================
 *
 * Use Case 4: Maintain Ordered Bogies using LinkedList
 */

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Train Consist ");
        System.out.println("========================================\n");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // ===== ADD BOGIES =====
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // ===== INSERT at specific position =====
        train.add(2, "Pantry Car");  // index 2

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // ===== REMOVE FIRST & LAST =====
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);

        // ===== FINAL STATE =====
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(train);

        System.out.println("\n========================================");
    }
}