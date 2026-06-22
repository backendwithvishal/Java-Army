// ============================================================
//   Topic 9: BENEFITS OF RANDOM ACCESS
//   1. Constant Time Access  - O(1) time
//   2. Efficient             - No need to traverse from beginning
//   3. Simple Indexing       - Easy to compute address using index
//   4. Better Performance    - Useful in searching, sorting, matrix ops
//   5. Memory Efficiency     - Contiguous storage improves cache performance
// ============================================================

public class BenefitsOfRandomAccess {
    public static void main(String[] args) {

        System.out.println("===== 9. BENEFITS OF RANDOM ACCESS =====");
        System.out.println();

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int n = arr.length;

        // -------------------------------------------------------
        // 1. CONSTANT TIME ACCESS - O(1)
        // -------------------------------------------------------
        System.out.println("1. CONSTANT TIME ACCESS - O(1)");
        System.out.println("   Any element can be accessed directly in O(1) time.");
        System.out.println("   arr[0]   = " + arr[0]);
        System.out.println("   arr[5]   = " + arr[5]);
        System.out.println("   arr[9]   = " + arr[9]);
        System.out.println();

        // -------------------------------------------------------
        // 2. EFFICIENT - No traversal needed
        // -------------------------------------------------------
        System.out.println("2. EFFICIENT - No need to traverse from the beginning.");
        int targetIndex = 7;
        System.out.println("   Directly accessing arr[" + targetIndex + "] = " + arr[targetIndex]);
        System.out.println("   (No loop needed, unlike Linked List)");
        System.out.println();

        // -------------------------------------------------------
        // 3. SIMPLE INDEXING - Address calculation
        // -------------------------------------------------------
        System.out.println("3. SIMPLE INDEXING - Easy address computation.");
        int baseAddress = 1000;
        int sizeOfInt = 4;
        int i = 6;
        int address = baseAddress + (i * sizeOfInt);
        System.out.println("   Address of arr[" + i + "] = " + baseAddress + " + (" + i + " x " + sizeOfInt + ") = " + address);
        System.out.println();

        // -------------------------------------------------------
        // 4. BETTER PERFORMANCE - Searching & Sorting
        // -------------------------------------------------------
        System.out.println("4. BETTER PERFORMANCE - Searching example (Linear Search):");
        int target = 60;
        for (int idx = 0; idx < n; idx++) {
            if (arr[idx] == target) {
                System.out.println("   Found " + target + " at index " + idx);
                break;
            }
        }

        System.out.println("   Sorting example (Bubble Sort):");
        int[] sortArr = {50, 10, 40, 20, 30};
        // Bubble sort
        for (int x = 0; x < sortArr.length - 1; x++) {
            for (int y = 0; y < sortArr.length - 1 - x; y++) {
                if (sortArr[y] > sortArr[y + 1]) {
                    int temp = sortArr[y];
                    sortArr[y] = sortArr[y + 1];
                    sortArr[y + 1] = temp;
                }
            }
        }
        System.out.print("   Sorted: ");
        for (int val : sortArr) System.out.print(val + " ");
        System.out.println();
        System.out.println();

        // -------------------------------------------------------
        // 5. MEMORY EFFICIENCY - Contiguous storage
        // -------------------------------------------------------
        System.out.println("5. MEMORY EFFICIENCY - Contiguous storage improves cache performance.");
        System.out.println("   Elements are stored next to each other in memory.");
        System.out.println("   Memory addresses of arr[10]:");
        for (int k = 0; k < n; k++) {
            System.out.println("   arr[" + k + "] = " + arr[k] + "  ->  Address: " + (baseAddress + k * sizeOfInt));
        }

        System.out.println();
        System.out.println("============================================");
        System.out.println("QUICK RECAP - KEY FORMULAS:");
        System.out.println("  1D Array: Address of A[i]    = BA + (i x S)");
        System.out.println("  2D Array: Address of M[i][j] = BA + ((i x C) + j) x S");
        System.out.println("  Where: BA = Base Address, S = SizeOf(DataType), C = Number of Columns");
        System.out.println("============================================");
    }
}
