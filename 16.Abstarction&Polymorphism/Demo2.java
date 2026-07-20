public class Demo2 {
    public static void main(String[] args) {
        A a = new B();
        // a.fun();
        // System.out.println(a.x);
        System.out.println(a.getX());
    }
}

//Static --> they belong to class and not to objects
// Private methods can't be overriden
// final method cannot be overriden

// Fields Variable they cannot be polymorphic

// class A {
//     static void fun() {
//         System.out.println("Hello");
//     }

//     private void fun2(){
//         System.out.println("Hello");
//     }

//     final void fun3(){
//         System.out.println("Bye");
//     }

// }

// class B extends A {
//     static void fun (){
//         System.out.println("Bye");
//     }

//     // void fun3 (){
//     //     System.out.println("Hello");
//     // }
// }

class A {
    // int x = 10;

    int getX(){
        return 10;
    }
}

class B extends A {
    int getX() {
        return 20;
    }
}