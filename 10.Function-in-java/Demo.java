public class Demo {
    public static void main(String[] args) {
        // Function in java

        SayHello("Vishal");
    }

    // No input , No output
    static void greet() {
        System.out.println("Hello World");
    }

    // Input , No Output
    static void SayHello(String name){
        System.out.println("Hello " + name);
    }

    // No Input , Output
    static int Sum(){
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }

    // Input , Output
    static int Sum(int a , int b){
        int c = a + b;
        return c;
    }

}