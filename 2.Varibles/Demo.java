public class Demo {
    public static void main(String[] args) {
        // Intergers --> bytes, short, int, long
        // byte b = 6; // Normal Decimal number
        // byte b = 0b101; // Binary 
        // byte b = 07; // 0 - 7 --> Octal
        byte b = 0XA; // 0 - 7 --> Hexadecimal (0 - 15) --> 0-9 , 10-A, 11-B, 12-C, 13-D, 14-E, 14-F 
        short s = 70;
        int i = 6000;
        long l = 200000;

        // Real numbers --> float double
        float f = 45.89f;
        double d = 10.4556;

        // charcters
        char c = 'a'; // 'a' --> interger --> binary --> store

        // boolean
        boolean bool = false;

        System.out.println( "Interger values --> "+ b + " , "+ s + " , " + i + " , "+ l );
        System.out.println( "Floating values --> "+ f + " , "+ d );
        System.out.println( "Characeter values --> "+ c  );
        System.out.println( "Boolean values --> "+ bool );

    }
}
