import java.util.Scanner;

public class MAİN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int k = 1; k <= (number - i); k++) {
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
