public class Demo1 {
    public static void main(String args[]) {
        // Function Overloading
        // Same name , Different parameters

        System.out.println(sum(1,2)); // 2 parameters

        System.out.println(sum(1,2,3)); // 3 parameters

        System.out.println(sum(1.0,2.0)); // 2 parameters , different data type

        name(); // No parameters

        name("Vishal"); // 1 parameter

        name("Vishal", 21); // 2 parameters

        name("Vishal", 21, "Thane"); // 3 parameters

        name("Vishal", 21, "Thane", "Maharashtra"); // 4 parameters
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
    
    static void name() {
        System.out.println("Hello World"); // No parameters
    }
    
    static void name(String name) {
        System.out.println("Hello " + name); // 1 parameter
    }
    
    static void name(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old"); // 2 parameters
    }

    static void name(String name, int age, String city) {
        System.out.println("Hello " + name + ", you are " + age + " years old and live in " + city); // 3 parameters
    }

    static void name(String name, int age, String city, String state) {
        System.out.println("Hello " + name + ", you are " + age + " years old and live in " + city + ", " + state);
    }
}