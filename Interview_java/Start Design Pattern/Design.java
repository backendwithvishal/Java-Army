
public class Design {

    public static void main(String[] args) {
        // Square star pattern

        // for (int i = 1; i < 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Right Traingle
        // for (int i = 1 ; i <=5; i++ ){
        //     for(int j = 1 ; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Right angle Traigle with number
        // for (int i = 1 ; i <=5; i++ ){
        //     for(int j = 1 ; j <= i; j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
        // Inverted Right Traingle
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
