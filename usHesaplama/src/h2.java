import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("üssü giirniz:");
        int a = tara.nextInt();
        System.out.println("lütfen üssünü alacağınız değeri girin:");
        int b = tara.nextInt();
        int i = 1;
        for (; a <= b; a *= a) {

            System.out.println(a);


        }
    }
}