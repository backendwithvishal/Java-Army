public class Demo {
    public static void main(String[] args) {
        // 1.Implicit conversion
        // (byte to int)
        // byte b = 56;
        // int i;

        // i = b;
        // System.out.println(i); //56

        // Char to int
        // char c = 's';
        // int i;
        
        // i = c;

        // System.out.println(i); // 115

        // 2.Explicit conversion
        // int i = 300;
        // byte b; //-128 to 128

        // b = (byte) i;
        // System.out.println(b); // 300 % 244 = 44

        // 3.Truncating Conversion 
        float f = 19.567f;
        int i;

        i = (int) f ;
        System.out.println(i); //19

        // 4.Boolean to any data type
        // These conversions are not possible

        // boolean tool = false;
        //  int i;

        // i = bool;

        

    }
}