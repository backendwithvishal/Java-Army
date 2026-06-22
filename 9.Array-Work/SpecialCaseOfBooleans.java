// ============================================================
//   Topic 4: SPECIAL CASE OF BOOLEANS
//   In Java, boolean values take 1 byte of memory.
//   false is typically stored as 0 and true as 1.
// ============================================================

public class SpecialCaseOfBooleans {
    public static void main(String[] args) {

        System.out.println("===== 4. SPECIAL CASE OF BOOLEANS =====");

        // Example: bool B[4] = {true, false, true, false}
        boolean[] B = {true, false, true, false};

        int baseAddress = 2000;
        int sizeOfBool = 1; // boolean = 1 byte in memory

        System.out.println("Boolean array: B[4] = {true, false, true, false}");
        System.out.println("SizeOf(boolean) = " + sizeOfBool + " byte");
        System.out.println();

        System.out.printf("%-10s %-10s %-15s %-15s%n",
                "Index", "Value", "Stored As", "Memory Address");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < B.length; i++) {
            int storedAs = B[i] ? 1 : 0;   // true = 1, false = 0
            int memAddress = baseAddress + (i * sizeOfBool);
            System.out.printf("%-10d %-10s %-15d %-15d%n",
                    i, B[i], storedAs, memAddress);
        }

        System.out.println();
        System.out.println("Note: Though booleans may use 1 byte,");
        System.out.println("actual size can depend on the language and system.");
    }
}
