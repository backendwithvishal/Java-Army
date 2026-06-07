public class Demo4 {
       public static void main(String[] args) {
       // Bitwise operations
       int a = 2; // 10 --> 00000000 00000000 00000000 00000010
       int b = 3; // 11 --> 00000000 00000000 00000000 00000011
       int c = a & b; // 10 --> 2
       int d = a | b; // 11 --> 3
       int e = a ^ b; // 01 --> 1
       int f = ~a; // 11111111 11111111 11111111 11111101 --> -3

       System.out.println(c + " , " + d + " , " + e + " , " + f);

       //Shift opertions 
       
    }
}
