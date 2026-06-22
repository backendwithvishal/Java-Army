// ============================================================
//   Topic 5: ARRAY INDEX OUT OF BOUNDS EXCEPTION
//   Accessing an index outside the valid range 0 to n-1
//   causes an ArrayIndexOutOfBoundsException.
//   Valid Index Range (0-based indexing): 0 to n-1
// ============================================================

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {

        System.out.println("===== 5. ARRAY INDEX OUT OF BOUNDS EXCEPTION =====");

        int[] A = {10, 20, 30, 40, 50}; // size n = 5
        int n = A.length;

        System.out.println("Array size n = " + n);
        System.out.println("Valid Index Range: 0 to " + (n - 1));
        System.out.println();

        // Valid accesses
        System.out.println("--- Valid Accesses ---");
        System.out.println("A[0] = " + A[0]); // valid
        System.out.println("A[1] = " + A[1]); // valid
        System.out.println("A[2] = " + A[2]); // valid
        System.out.println("A[3] = " + A[3]); // valid
        System.out.println("A[4] = " + A[4]); // valid (n-1 = 4)

        System.out.println();
        System.out.println("--- Invalid Access (Handled with try-catch) ---");

        // Invalid access: A[-1] -> Exception
        try {
            System.out.println("Trying A[-1]...");
            System.out.println(A[-1]); // invalid
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage() + " -> Invalid!");
        }

        // Invalid access: A[5] -> Exception (index = n, out of range)
        try {
            System.out.println("Trying A[5]...");
            System.out.println(A[5]); // invalid
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage() + " -> Invalid!");
        }

        // Invalid access: A[100] -> Exception
        try {
            System.out.println("Trying A[100]...");
            System.out.println(A[100]); // invalid
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage() + " -> Invalid!");
        }

        System.out.println();
        System.out.println("Rule: Always use index in range [0, n-1] to avoid exceptions.");
    }
}
