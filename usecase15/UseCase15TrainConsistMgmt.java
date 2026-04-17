/**
 * =========================================================
 * MAIN CLASS - UseCase15TrainConsistMgmt
 * =========================================================
 *
 * Use Case 15: Safe Cargo Assignment using try-catch-finally
 */

// ===== CUSTOM RUNTIME EXCEPTION =====
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ===== GOODS BOGIE CLASS =====
class GoodsBogie {
    String type;   // Cylindrical / Rectangular
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            // ===== VALIDATION =====
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " -> " + (cargo != null ? cargo : "No Cargo");
    }
}

// ===== MAIN CLASS =====
public class UseCase15TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("========================================\n");

        // ===== CREATE BOGIES =====
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ===== SAFE CASE =====
        b1.assignCargo("Petroleum");

        // ===== UNSAFE CASE =====
        b2.assignCargo("Petroleum");

        // ===== CONTINUE EXECUTION =====
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\n========================================");
    }
}