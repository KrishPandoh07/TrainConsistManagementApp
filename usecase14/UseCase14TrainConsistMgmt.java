/**
 * =========================================================
 * MAIN CLASS - UseCase14TrainConsistMgmt
 * =========================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity
 */

// ===== CUSTOM EXCEPTION =====
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// ===== BOGIE CLASS =====
class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

// ===== MAIN CLASS =====
public class UseCase14TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC14 - Custom Exception Handling ");
        System.out.println("========================================\n");

        try {
            // ===== VALID CASE =====
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            // ===== INVALID CASE =====
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n========================================");
    }
}