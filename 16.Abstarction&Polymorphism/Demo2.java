public class Demo2 {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}

class A {
    static void fun() {
        System.out.println("Hello");
    }
}

class B extends A {
    static void fun (){
        System.out.println("Bye");
    }
}