// ============================================================
//   Topic 7: RANDOM ACCESS IN 2D ARRAY
//   Formula: Address of M[i][j] = BaseAddress + ((i x C) + j) x SizeOf(DataType)
//   Where:
//     BaseAddress  -> address of M[0][0]
//     i            -> row index (0 to R-1)
//     j            -> column index (0 to C-1)
//     C            -> total number of columns
//     SizeOf(DataType) -> size in bytes of each element
// ============================================================

public class RandomAccessIn2DArray {
    public static void main(String[] args) {

        System.out.println("===== 7. RANDOM ACCESS IN 2D ARRAY =====");
        System.out.println("Formula: Address of M[i][j] = BaseAddress + ((i x C) + j) x SizeOf(DataType)");
        System.out.println();

        int baseAddress = 5000;
        int C = 4;           // Number of columns
        int sizeOfInt = 4;   // SizeOf(int) = 4 bytes

        int[][] M = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };

        // Example from image: Find address of M[2][3]
        int i = 2, j = 3;
        int address = baseAddress + ((i * C) + j) * sizeOfInt;
        System.out.println("Example: BaseAddress = 5000, C = 4, SizeOf(int) = 4");
        System.out.println("Find address of M[2][3]:");
        System.out.println("= 5000 + ((" + i + " x " + C + ") + " + j + ") x " + sizeOfInt);
        System.out.println("= 5000 + (" + (i * C) + " + " + j + ") x " + sizeOfInt);
        System.out.println("= 5000 + " + ((i * C) + j) + " x " + sizeOfInt);
        System.out.println("= 5000 + " + (((i * C) + j) * sizeOfInt));
        System.out.println("= " + address);  // 5000 + 44 = 5044

        System.out.println();
        System.out.println("--- Address of all elements in M[3][4] ---");
        System.out.printf("%-12s %-15s %-15s%n", "Element", "M[i][j]", "Address");
        System.out.println("------------------------------------------");

        for (int r = 0; r < M.length; r++) {
            for (int c = 0; c < M[0].length; c++) {
                int addr = baseAddress + ((r * C) + c) * sizeOfInt;
                System.out.printf("%-12d M[%d][%d]       %-15d%n", M[r][c], r, c, addr);
            }
        }
    }
}
