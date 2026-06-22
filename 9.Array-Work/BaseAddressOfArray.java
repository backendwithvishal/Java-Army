public class BaseAddressOfArray {
    public static void main(String[] args) {

        // base address = memory address of A[0]
        // it's the starting point to find address of any element
        // formula: Address of A[i] = BA + (i * S)
        // BA = base address, S = size of data type

        int[] A = {5, 15, 25, 35, 45};

        int BA = 2000; // base address (address of A[0])
        int S = 4;     // size of int = 4 bytes

        System.out.println("BA = " + BA + ", S = " + S);
        System.out.println();

        for (int i = 0; i < A.length; i++) {
            int address = BA + (i * S);
            System.out.println("A[" + i + "] = " + A[i] + "  ->  address = " + BA + " + (" + i + " * " + S + ") = " + address);
        }

        // A[0] is always at base address itself
        // A[1] is at BA + 4, A[2] at BA + 8, and so on
    }
}
