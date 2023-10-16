import java.util.Scanner;

public class kombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println(" n değerini giriniz:");
        System.out.println("r değerini girniz:");
        int n = tara.nextInt();
        int r = tara.nextInt();
        int total = 1;
        int nf = 1;
        int rf = 1;
        int y = 1;

        for (int x = 1; x <= n; x++) {
            nf = nf * x;
            {
                for (int a = 1; x <= r; r++) {
                    rf = rf * a;
                }
                for (int b = 1; x < (n - r); x++) {
                    y = y * b;
                    System.out.println(y);
                }

            }

            System.out.println("kombinasyon:" + (nf / (rf * y)));
        }
    }
}