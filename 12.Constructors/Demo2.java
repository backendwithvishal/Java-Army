// This Keyword & Constructor Chaining

public class Demo2 {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Vishal");
        // Student s3 = new Student("Aryan", 22);
        // Student s4 = new Student("Yash", 21, 9.0);

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.cgpa);
    }
}

class Student {
    String name;
    int rollNo;
    double cgpa;

    Student() {
        System.out.println("Default constructor is calling");
    }

    // Parameterized constructor with one parameter
    Student(String name) {

        // this(name);

        // FIX: Call default constructor
        this();

        this.name = name;

        System.out.println("I am in first constructor");
    }

    // Two-parameter constructor
    Student(String name, int rollNo) {

        // this(name, rollNo);

        // FIX: Chain to one-parameter constructor
        this(name);

        this.rollNo = rollNo;
        System.out.println("I am in second constructor");
    }

    // Three-parameter constructor
    Student(String name, int rollNo, double cgpa) {

        // this(name, rollNo, cgpa);

        this(name, rollNo);

        this.cgpa = cgpa;
        
        System.out.println("I am in third constructor");
    }

    /*
    Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
    */

    void markAttendence() {
        System.out.println(name + " marked attendance");
    }
}