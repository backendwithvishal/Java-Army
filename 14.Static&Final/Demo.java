// Static Keyword

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Vishal", 21, 1);
        Student s2 = new Student("Aryan", 12, 2);

        // Student.college = "IITMumbai";
        System.out.println(s1.name + " , " + s1.age + " , " + s1.rollNo + " , " + Student.college);
        System.out.println(s2.name + " , " + s2.age + " , " + s2.rollNo + " , " + Student.college);
        
    }
}

class Student {
    String name;
    int rollNo;
    int age;
    static String college;

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Static block
    static {
        college = "IITMumbai";
    }
}