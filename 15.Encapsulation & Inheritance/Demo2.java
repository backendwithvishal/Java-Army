public class Demo2{
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();
    }
}

class Student {
    String name;
    int age;

    void markAttendance() {
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student {
    void attendLab() {
        System.out.println("lab attended");
    }
}