public class Demo {
    public static void main(String[] args) {
        boolean b = true;
        int i = 5;
        // Selection statements
        // Normal if 
        // if (i > 5 && i < 10) {
        //     System.err.println("i is greater then5");
        // } else {
        //     System.out.println("i is less then or equal to 5");
        // }

        if (i % 2 == 0) {
            if (i > 5 && i < 10) {
                System.err.println("i is odd");
            }
        } else {
            System.out.println("i is even");
        }

        // nested if
    }
}
