import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int ebob=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı 1 giriniz:");
        System.out.println("sayı 2 giriniz:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i = 1; i <= a && i <= b; i++) {
            if ((a % i == 0) && (b%i==0)){
                ebob=i;
            }
        }
        System.out.println(ebob);

    }
}
