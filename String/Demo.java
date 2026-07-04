public class Demo {
    public static void main (String [] args) {
        String s1 = "Hello"; // Literal
        String s2 = "Hello";
        
        System.out.println(s1 == s2);

        String s3 = new String("Aryan");
        String s4 = new String("Aryan");

        System.out.println(s3 == s4);
    }   
}