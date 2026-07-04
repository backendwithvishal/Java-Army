public class largestnumber{
    public static void main (String[] args) {
        int a = 15;
        int b = 35;
        int c = 25;

        if ( a >= b && a >= c) {
            System.out.println("Largets Number = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largets Number = " + b);
        } else {
            System.out.println("Largest Number = " + c);
        }
    }
}