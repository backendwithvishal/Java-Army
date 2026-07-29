// Local Class
public class Demo1 {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.greet();
    }
}

// Effective final variable

class Outer {
    void greet() {
        int y = 10;
        class Local {
            void sayHello() {
                System.out.println(y);
            }
            void sayHii(){
                System.out.println("Hii");
            }

            void sayTakeCare(){
                System.out.println("See u take care");
            }
        }

        Local local = new local();
        local.sayHello();
        local.sayHii();
        local.sayTakeCare();
    }
}
/*
Where we can create a local class :-
Constructor
Method
If
Loop
*/