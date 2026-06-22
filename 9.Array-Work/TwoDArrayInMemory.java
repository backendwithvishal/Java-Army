// ============================================================
//   Topic 6: 2D ARRAY IN MEMORY
//   A 2D array is stored in row-major order (row by row).
//   All elements of the first row are stored first,
//   then second row, and so on.
// ============================================================

public class TwoDArrayInMemory {
    public static void main(String[] args) {

        System.out.println("===== 6. 2D ARRAY IN MEMORY (Row-Major Order) =====");

        // Example: int M[3][4]
        int[][] M = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };

        int rows = M.length;    // R = 3
        int cols = M[0].length; // C = 4

        System.out.println("Matrix M[" + rows + "][" + cols + "]:");
        System.out.println();

        // Print 2D array in matrix form
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", M[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Row-Major Order (how stored in memory):");

        // Flatten and show row-major order
        int baseAddress = 5000;
        int sizeOfInt = 4;

        System.out.printf("%-10s %-15s %-10s %-10s %-15s%n",
                "Index", "Element M[i][j]", "Row(i)", "Col(j)", "Memory Address");
        System.out.println("--------------------------------------------------------------");

        int linearIndex = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int address = baseAddress + linearIndex * sizeOfInt;
                System.out.printf("%-10d %-15d %-10d %-10d %-15d%n",
                        linearIndex, M[i][j], i, j, address);
                linearIndex++;
            }
        }

        System.out.println();
        System.out.println("Memory layout: 1,2,3,4 | 5,6,7,8 | 9,10,11,12");
        System.out.println("(Each row is stored consecutively)");
    }
}
