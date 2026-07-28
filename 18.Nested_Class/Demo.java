public class Demo {
    public static void main (String [] args) {

        Outer outer = new Outer();

        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun();
    }
}

class Outer {

    static int x = 7;
    int y;

    static class Inner {

        Outer outer;
        String name;
        static int number;
        
        Inner(Outer outer) {
            this.outer = outer;
        }


        void fun(Outer outer) {
            System.out.println(x);
            System.out.println(outer.y);
        }
    }
}