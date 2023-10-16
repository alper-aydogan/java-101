import java.util.Scanner;

public class x {
    static boolean isPrime(int a) {
        int result = 0;
        ;
        int i = 2;
        for (; i < a; i++) {
            result = a % i;
            if (result == 0) {
                return true;
            } else {
                return false;
            }
            return isPrime(a);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı girniz:");
        int input = scan.nextInt();
        System.out.println(isPrime(input));
    }
}


