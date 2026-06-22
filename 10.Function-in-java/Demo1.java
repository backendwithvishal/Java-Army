public class Demo1 {
    public static void main(String args[]) {
        // Function Overloading
        // Same name , Different parameters

        System.out.println(sum(1,2));
        
        System.out.println(sum(1,2,3));

        System.out.println(sum(1.0,2.0));
    }

    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b , int c) { // different no. of parameters
        return (a + b + c);
    }

    static int sum(double a, double b) { // different data type of parameters
        return (int)(a + b);
    }
}