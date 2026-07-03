public class palindrome {
    public static void main(String [] args) {
        int original = 131;
        int temp = original;
        int reversed = 0;
        
        while (temp>0) {
            int lastDigit = temp % 10;
            reversed = (reversed * 10) + lastDigit;
            temp = temp/10;
        }

        if (original == reversed){
            System.out.println("It is a Palindrom number");

        } else {
            System.out.println("It is a not a Palindrom number");
        }
    }
}