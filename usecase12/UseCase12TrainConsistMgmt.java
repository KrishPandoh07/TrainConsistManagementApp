import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase12TrainConsistMgmt
 * =========================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 */

class GoodsBogie {
    String type;   // Cylindrical, Open, Box
    String cargo;  // Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class UseCase12TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("========================================\n");

        // ===== CREATE GOODS BOGIES =====
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Uncomment below to test failure case:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // ===== SAFETY CHECK =====
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                        b.cargo.equals("Petroleum")
                );

        // ===== DISPLAY =====
        System.out.println("Goods Bogies:");
        bogies.forEach(System.out::println);

        System.out.println("\nSafety Status: " +
                (isSafe ? "SAFE ✅" : "UNSAFE ❌"));

        System.out.println("\n========================================");
    }
}