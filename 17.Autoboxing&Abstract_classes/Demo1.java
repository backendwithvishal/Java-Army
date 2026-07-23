public class Demo1{
    public static void main(String[] args){
        // int x = 20;
        // int y = 20;
        // System.out.println(x == y);

        // Integer a = 22;
        // Integer b = 22;
        // System.out.println(a == b); 

        // Autoboxing 
        // int x = 10;
        // Integer y = x; // autoboxing

        // System.out.println(x);
        // System.out.println(y);  // unboxing

        // //Unboxing
        // Integer a = 22; // Autoboxing
        // int b = a; // unboxing

        // System.out.println(a); 
        // System.out.println(b); 

        // int x = 50;
        // printInteger(x); // auto boxing

        Integer a = 10; 
        Integer b = 20; // auto boxing

        int sum = a.intValue() + b.intValue(); // unboxing
        System.out.println(sum);  // auto boxing
    }

    static void printInteger(Integer x) {
        System.out.println(x); // auto unboxing

    }
}