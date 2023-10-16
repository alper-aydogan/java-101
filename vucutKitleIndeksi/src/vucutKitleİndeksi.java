import java.util.Scanner;

public class vucutKitleİndeksi {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("lütfen boyunuzu giriniz(örn:1,72):");
        double boy= tara.nextDouble();
        System.out.println("lütfen kilonuzu giriniz:");
        double kilo= tara.nextDouble();
        double vki=kilo/(boy*boy);
        System.out.println("vucut kitle indeksiniz:"+vki);



    }
}
