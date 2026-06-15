public class Loop2 {
    public static void main(String[] args) {
        // Nested loops with start pattern
        for (int v = 1; v <= 15; v++){
            for (int s = 1; s <= v; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
