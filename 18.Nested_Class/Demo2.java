// Anonymous class

public class Demo2{
    public static void main(String[] args) {
        // Person p1 = new Person();
        // p1.introduce();

        // Person p2 = new Guest();
        // p2.introduce();

        Person p2 = new Person() {

            String name = "Vishal";

            @Override
             void introduce() {
                greet();
                System.out.println("Hii, I am a " + name);   
            }

            void greet() {
                System.out.println("Hello");
            }
        };
        p2.introduce();
    }
}

class Person {
    void introduce() {
        System.out.println("Hii, I am a Person");
    }
}

class Guest extends Person {
    @Override
    void introduce() {
        System.out.println("Hii, I am a Guest");
    }
}

/* 
Static Nested Class

Inner Class

Anonymous Class --> Lambdas

Local Class
*/