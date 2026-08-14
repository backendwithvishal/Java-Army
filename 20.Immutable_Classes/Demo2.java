public class Demo2 { 
    public static void main(String []args){ 
         
        College college = new College("IIT M", "Mumbai"); 
 
        Student s1 = new Student(21, "Vishal", college); 
 
        System.out.println(s1.getCollege().name); 
 
        s1.getCollege().name = "IIT G"; 
 
        System.out.println(s1.getCollege().name); 
 
    } 
} 

// Immutable 
// defensive copy of college (non primitive) 
class Student { 
    private final int age; 
    private final String name; 
    private final College college; 
 
    Student(int age, String name, College college) { 
        this.age = age; 
        this.name = name; 
        this.college = new College(college.name, college.address); 
    } 
 
    public int getAge() { 
        return this.age; 
    } 
 
    public String getName() { 
        return this.name; 
    } 
 
    public College getCollege() { 
        return new College(this.college.name, this.college.address); 
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