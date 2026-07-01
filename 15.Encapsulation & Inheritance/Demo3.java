// Types of Inheritance
// Single Inheritance
// Multi-level Inheritance
// Hybrid Inheritance 
// Multiple Inheritance (not supported in java)

public class Demo3 {
    public static void main (String [] args){

    }
}

class Student {  // Parent Class
    String name;
    int age;

    void markAttendance() {
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student {  // Child Class
    void attendLab() {
        System.out.println("lab attended");
    }
}

class BCAEngineeringStudent extends EngineeringStudent {
    void attendedBCALab() {
        System.out.println("BCA lab attended");
    }
}

/*
Multi-level

Student
|
EngineeringStudent
|
BCAEngineeringStudent
*/