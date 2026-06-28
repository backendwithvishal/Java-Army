// Call by Value

public class Demo{
    public static void main(String[]args){
        int x = 10;
        int y = 20;

        System.out.println("Before calling swap() method, x = " + x + ", y = " + y);

        addTen(x,y);
        
        System.out.println("After calling swap() method, x = " + x + ", y = " + y);
    }
    
    static void addTen(int x, int y){
        x += 10;
        y += 10;
    }
}