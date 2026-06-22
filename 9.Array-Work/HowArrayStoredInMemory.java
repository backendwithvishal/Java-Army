public class HowArrayStoredInMemory {
    public static void main(String[] args) {

        // array elements are stored in contiguous memory locations
        // each element takes equal space depending on data type
        // for int -> each element takes 4 bytes

        int[] A = {10, 20, 30, 40, 50};

        int baseAddress = 1000;
        int size = 4; // int = 4 bytes

        System.out.println("Index | Element | Memory Address");
        System.out.println("----------------------------------");

        for (int i = 0; i < A.length; i++) {
            int memAddress = baseAddress + (i * size);
            System.out.println("  " + i + "   |   " + A[i] + "   |   " + memAddress);
        }

        // key point: A[0] is at 1000, A[1] at 1004, A[2] at 1008...
        // each next element is 4 bytes ahead of the previous one
        System.out.println("\nEach int takes 4 bytes, so addresses go 1000, 1004, 1008...");
    }
}
