import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("lütfen aldığınız ürünün fiyatını giriniz:");
        double tutar = tara.nextDouble();
        if (tutar < 1000) {
            double kdvOranı = 0.18;
            double kdvFiyatı = tutar * kdvOranı;
            double toplamTutar = kdvFiyatı + tutar;
            System.out.println("ürünün toplam fiyatı:" + toplamTutar);
        }
        if (tutar >= 1000) {
            double kdvOranı = 0.08;
            double kdvFiyatı = tutar * kdvOranı;
            double toplamTutar=tutar+kdvFiyatı;
            System.out.println("ürünün toplam fiyatı:"+toplamTutar);


        }
    }
}
