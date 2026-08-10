public class Demo {
    public static void main(String[] args) {

        College college = new College("IIT M", "Mumbai");

        Student s1 = new Student(21, "Vishal", college);

        System.out.println(s1.getCollege().name);
    }
}

// Immutable class
class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return this.college;
    }
}

// Mutable class
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}