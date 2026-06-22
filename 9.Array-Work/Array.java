public class Array {
    public static void main(String[] args) {

        // 1. Random Access in Array
        // we can access any element directly using its index in O(1) time
        // formula: Address of A[i] = BaseAddress + (i * SizeOf(DataType))

        int[] A = {10, 20, 30, 40, 50};

        System.out.println(A[0]); // 10
        System.out.println(A[2]); // 30
        System.out.println(A[4]); // 50

        // address calculation example
        // baseAddress = 1000, sizeOfInt = 4, index = 3
        // Address of A[3] = 1000 + (3 * 4) = 1012
        int baseAddress = 1000;
        int sizeOfInt = 4;
        int index = 3;
        int address = baseAddress + (index * sizeOfInt);
        System.out.println("Address of A[3] = " + address); // 1012


        // 2. How Array is Stored in Memory
        // elements are stored in contiguous (side by side) memory locations
        // each int takes 4 bytes

        System.out.println("\nIndex | Element | Memory Address");
        for (int i = 0; i < A.length; i++) {
            int memAddr = 1000 + (i * 4);
            System.out.println("  " + i + "   |   " + A[i] + "   |   " + memAddr);
        }


        // 3. Base Address of Array
        // base address = address of A[0]
        // Address of A[i] = BA + (i * S)

        int BA = 2000;
        int S = 4;
        int[] B = {5, 15, 25, 35, 45};

        System.out.println("\nBase Address = " + BA);
        for (int i = 0; i < B.length; i++) {
            int addr = BA + (i * S);
            System.out.println("A[" + i + "] address = " + BA + " + (" + i + " * " + S + ") = " + addr);
        }


        // 4. Special Case of Booleans
        // boolean takes 1 byte in memory
        // true is stored as 1, false is stored as 0

        boolean[] boolArr = {true, false, true, false};
        int boolBase = 2000;

        System.out.println("\nIndex | Value | Stored As | Memory Address");
        for (int i = 0; i < boolArr.length; i++) {
            int storedAs = boolArr[i] ? 1 : 0;
            int memAddr = boolBase + i; // 1 byte each
            System.out.println("  " + i + "   | " + boolArr[i] + " |     " + storedAs + "     |     " + memAddr);
        }


        // 5. Array Index Out of Bounds Exception
        // valid index range is 0 to n-1
        // going outside this range throws an exception

        int[] arr = {10, 20, 30, 40, 50}; // valid indices: 0 to 4

        System.out.println("\n" + arr[0]); // valid
        System.out.println(arr[4]);        // valid

        try {
            System.out.println(arr[5]); // invalid - out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception at A[5]: " + e.getMessage());
        }

        try {
            System.out.println(arr[100]); // invalid
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception at A[100]: " + e.getMessage());
        }


        // 6. 2D Array in Memory (Row-Major Order)
        // stored row by row: first row first, then second row, and so on

        int[][] M = {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12}
        };

        System.out.println("\nMatrix:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\nRow-major in memory: ");
        for (int i = 0; i < M.length; i++)
            for (int j = 0; j < M[0].length; j++)
                System.out.print(M[i][j] + " ");
        System.out.println();


        // 7. Random Access in 2D Array
        // Address of M[i][j] = BA + ((i * C) + j) * S
        // C = number of columns

        int ba = 5000;
        int C = 4;
        int sz = 4;

        // find address of M[2][3]
        // = 5000 + ((2 * 4) + 3) * 4
        // = 5000 + 11 * 4
        // = 5000 + 44 = 5044
        int row = 2, col = 3;
        int addr2D = ba + ((row * C) + col) * sz;
        System.out.println("\nAddress of M[2][3] = " + addr2D); // 5044


        // 8. Array of Strings
        // each string is stored like a char array ending with '\0'

        String[] names = {"Ram", "Shyam", "Maya"};

        for (int i = 0; i < names.length; i++) {
            System.out.print("names[" + i + "]: ");
            for (char ch : names[i].toCharArray()) {
                System.out.print(ch + " ");
            }
            System.out.println("\\0"); // null terminator at the end
        }


        // 9. Benefits of Random Access
        // 1. Constant time O(1) access
        // 2. No need to traverse from beginning
        // 3. Simple address calculation using index
        // 4. Better performance in search and sort
        // 5. Contiguous memory = better cache performance

        System.out.println("\nBenefits of Random Access:");
        System.out.println("1. O(1) time - direct access");
        System.out.println("2. No traversal needed");
        System.out.println("3. Address = BA + (i * S)");
        System.out.println("4. Good for searching and sorting");
        System.out.println("5. Cache friendly due to contiguous memory");
    }
}
