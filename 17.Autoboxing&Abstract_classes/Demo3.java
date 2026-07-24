public class Demo3 {
    public static void main(String [] args) {
        Animal a = new Dog();
        a.makesound();
    }
}

abstract class Animal {
    String name;

    Animal (String name) {
        this.name = name;
    }

    void makesound() {
        System.out.println("Making sound")
    }

    final void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {
    @Override
    void makesound() {
        System.out.println("Making barking sound");
    }
}

// Abstract classes
// 1. Cannot be instantiated directly
// 2. Can contain abstract method (method without implementations)
// 3. Can also contain normal methods
// 4. Is meant to be extended

// Question:
// 1. Can abstract classes have constructors?  --> Yes
// 2. Can abstract classes be final ? --> No
// 3. Can abstract class have static methods/variables ? --> Yes
// 4. Can abstract classes private methods ? --> yes but non abstract
// 5. Can abstract classes have final methods ? --> yes but non abstract
// 6. Can abstract classes have no abstract method ? --> Yes