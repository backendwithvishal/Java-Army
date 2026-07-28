// Local Class
public class Demo2 {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.greet();
    }
}

class Outer {
    void greet() {
        class Local {
            void sayHello() {
                System.out.println("Hello");
            }
        }

        Local local = new local();
        local.sayHello();
    }
}