import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        System.out.println("n sayısını giriniz:");
        System.out.println("r sayısını giriniz:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int x=(n-r);
        int nfaktöriyel = 1;
        int rfaktöriyel = 1;
        int xfaktöriyel = 1;
        for (int i = 1; i <= n; i++) {
            nfaktöriyel = nfaktöriyel * i;
        }
       // System.out.println("faktöriyel:" + nfaktöriyel);
        for (int i = 1; i <= r; i++) {
            rfaktöriyel = rfaktöriyel * i;
        }
       // System.out.println("faktöriyel:" + rfaktöriyel);
        for (int i = 1; i <= x; i++) {
            xfaktöriyel = xfaktöriyel * i;
        }
      //  System.out.println("faktöriyel:" + xfaktöriyel);
        int kombinasyon=nfaktöriyel/(xfaktöriyel*rfaktöriyel);
        System.out.println("kombinasyon eşittir:"+kombinasyon);
    }
}
