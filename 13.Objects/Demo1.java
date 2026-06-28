// Call by reference
public class Demo1 {
    public static void main(String[] args) {
     Random r1 = new Random(4, 5);

     System.out.println( r1.x + " , " + r1.y);

     addTen(r1);

     System.out.println( r1.x + " , " + r1.y);

    }
    static void addTen(Random r) {
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}

class Random {
    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }
}