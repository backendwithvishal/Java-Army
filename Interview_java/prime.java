public class prime{
    public static void main (String [] args){
        int n = 4;
        boolean isPrime = true;

        if (n<=1){
            isPrime = false;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("This is the prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
} 