public class Demo4 {
    public static void main(String[] args) {
         // Recursion = function calling itself

         fun1();
    }

    static void fun1() {
        fun2();
        System.out.println("Hello World"); // 5
    }

    static void fun2() {
        fun3();
        System.out.println("Hello World"); // 4
    }

    static void fun3() {
        fun4();
        System.out.println("Hello World"); // 3
    }

    static void fun4() {
        fun5();
        System.out.println("Hello World"); // 2
    }

    static void fun5() {
        System.out.println("Hello World"); // 1
    }
}