// Simple program to demonstrate array initialization and iteration
public class Array {
    // Main method: program entry point
    public static void main(String[] args) {
        // Declare an integer array of size 3
        int[] rollNo = new int[3];
        //101, 102, 103

        // rollNo[0] = 101;
        // rollNo[1] = 102;
        // rollNo[2] = 103;

        // System.out.println(rollNo[0]);
        // System.out.println(rollNo[1]);
        // System.out.println(rollNo[2]);

        // System.out.println(rollNo.length);

        int v = 101;
        // Fill the array with sequential values
        for (int s = 0; s < rollNo.length; s++) {
            rollNo[s] = v;
            v++;
        }
        // Print each element of the array
        for (int s = 0; s < rollNo.length; s++) {
            System.out.println(rollNo[s]);
        }
    }
}