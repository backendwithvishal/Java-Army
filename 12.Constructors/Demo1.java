public class Demo1{
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.cgpa);
    }
}

class Student {
    String name;
    int rollNo;
    double cgpa;

    // 

    void markAttendence() {
        System.out.println(name + "marked attendence");
    }
}