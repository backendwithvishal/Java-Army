public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Vishal";
        s1.rollNo = 21;
        s1.cgpa = 9.0;

        // Constructor -> to create an object

        // Default values are printed here if we don't initialize the object
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.cgpa);

    }
}

/*
Integer --> 0
Float --> 0.0
boolean --> false
char --> '\0'
String --> null
*/

class Student {
    String name;
    int rollNo;
    double cgpa;
}