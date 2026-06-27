// This Keyword & Chaining

public class Demo1{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s1 = new Student("Vishal");
        Student s3 = new Student("Vishal", 22);
        Student s2 = new Student("Vishal", 21, 9.0);

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
        System.out.println("constructor is calling with this keyword");
    }

    // Parameterized constructor with one parameterized this Keyword
    Student(String name) {
        this(name);
    }

    // Two Parameterized constructor with two parameterized this Keyword
    Student(String name, int rollNo) {
        this(name, rollNo);
    }

    // Three Parameterized constructor with this Keyword
    Student(String name, int rollNo, double cgpa) {
        this(name, rollNo, cgpa);
    }

    // Parameterized constructor with this Keyword
    Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }
    
    void markAttendence() {
        System.out.println(name + "marked attendence");
    }
}