public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.name = "Vishal";
        s1.age = 20;
        s1.rollNumber = 1;
        s1.college = "Sahyog College";

        // Student s2 = new Student();
        s2.name = "Shravani";
        s2.age = 19;
        s2.rollNumber = 2;
        s2.college = "Sahyog College";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }

    class Student {
        String name;
        int age;
        int rollNumber;
        String college;

        void markAttendance() {
            System.out.println("Attendance marked for " + name);
        }

        void print() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("College: " + college);
        }
    }
}