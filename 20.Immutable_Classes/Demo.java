public class Demo {
    public static void main (String []args) {
        Student s1 = new Student(21, "Vishal");

        // System.out.println(s1.getAge());
        // System.out.println(s1.getName());

        College college = new College("IIT M", "Mumbai");
        System.out.println(college.name);
    }
}

// Immutable class
class Student {
    private final int age;
    private final String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}

// Mutable class
class College {
    String name;
    String address;

    College(String name, String address){
        this.name = name;
        this.address = address;
    }
}