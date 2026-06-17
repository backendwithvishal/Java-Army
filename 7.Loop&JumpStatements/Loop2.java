public class Loop2 {
    public static void main(String[] args) {
        // Nested loops with start pattern
        // for (int v = 1; v <= 15; v++){
        //     for (int s = 1; s <= v; s++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Jump Statement in Java
        // break,, continue,, return

        // boolean b = false;

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(i);

        //     if(b == true) {
        //         break;
        // }
        // }

        // Whether the number is prime or not using break statement
        
        // int p = 6;

        // int v;
        // for( v = 2; v < p; v++) {
        //     if (p % v == 0) {
        //         System.out.println("Not a Prime");
        //         break;
        //     }
        // }

        // if(v == p) {
        //     System.out.println("Prime number");
        // }

        for(int v = 1; v <= 10; v++) {
            if (v % 2 == 0) {
                continue;
            }
            System.out.println(v);
        }
    }
}