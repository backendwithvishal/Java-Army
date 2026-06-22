public class Demo3 {

    static String name = "Vishal Sanam"; // Global Variable
    static int age = 21; // Global Variable

    public static void main(String[] args) {
        // Scope of a Variable

        int x = 4; // local varible
        int y = 5;

        // we can not access x outside the main method

        if (x == 4) {
            int v = 7;
            System.out.println(v); // Local Variable (inside if block)
        }

        System.out.println(x + " , " + y); // Local Variable (inside main method)

        System.out.println(name + " , " + age); // we can access global variable here & every in this file 

        // fun1();
    }

}