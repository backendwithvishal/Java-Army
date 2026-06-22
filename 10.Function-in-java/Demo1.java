public class Demo1 {
    public static void main(String args[]) {
        // Function Overloading
        // Same name , Different parameters

        System.out.println(sum(1,2));

        System.out.println(sum(1,2,3));

        System.out.println(sum(1.0,2.0));

        name();

        name("Vishal");

        name("Vishal", 22);

        name("Vishal", 22, "Thane");

        name("Vishal", 22, "Thane", "Maharashtra");
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
        System.out.println("Hello World");
    }
    
    static void name(String name) {
        System.out.println("Hello " + name);
    }
    
    static void name(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old");
    }

    static void name(String name, int age, String city) {
        System.out.println("Hello " + name + ", you are " + age + " years old and live in " + city);
    }

    static void name(String name, int age, String city, String state) {
        System.out.println("Hello " + name + ", you are " + age + " years old and live in " + city + ", " + state);
    }
}