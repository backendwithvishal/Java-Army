public class Demo {
    public static void main(String[] args) {

        Demo demo = new Demo();
        Student s1 = demo.new Student();
        Student s2 = demo.new Student();
        
        s1.name = "Vishal"; // Assigning values to the attributes of s1 object
        s1.age = 20;
        s1.rollNumber = 1;
        s1.college = "Sahyog College";

        s2.name = "Shravani"; // Assigning values to the attributes of s2 object
        s2.age = 19;
        s2.rollNumber = 2;
        s2.college = "Sahyog College";

        s1.markAttendance(); // Calling the markAttendance method for s1 object
        s2.markAttendance();

        s1.print(); // Calling the print method for s1 object
        s2.print(); // Calling the print method for s2 object
    }

    class Student { // Class Student
        String name; // Attribute name
        int age; // Attribute age
        int rollNumber; // Attribute rollNumber
        String college; // Attribute college

        void markAttendance() { // Method markAttendance
            System.out.println("Attendance marked for " + name); // Printing the name of the student
        }

        void print() { // Method print
            System.out.println("Name: " + name); // Printing the name of the student
            System.out.println("Age: " + age); // Printing the age of the student
            System.out.println("Roll Number: " + rollNumber); // Printing the roll number of the student
            System.out.println("College: " + college); // Printing the college of the student
        }
    }
}