import java.util.Scanner;

public class demos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen yasınızı girniz:");
        int yas = input.nextInt();
        System.out.println("lütfen mesafeyi giriniz:");
        int km = input.nextInt();
        System.out.println("yolculuk tipinizi seçiniz:" + "tip 1 =gidiş" + "tip 2 gidiş-dönüş");
        int tip = input.nextInt();
        double tutar = 0.10 * km;
        String msj = "indirimli bilet fiyatı:";
        if (yas > 0 && km > 0 && tip < 2) {
            if (yas < 12) {
                double tutar2 = tutar - (tutar * 0.5);
                System.out.println(msj + tutar2);
            } else if (yas < 24 && yas > 12) {
                double tutar3 = tutar - (tutar * 0.1);
                System.out.println(msj + tutar3);
            } else if (yas > 65) {
                double tutar4 = tutar - (tutar * 0.3);
            } else {
                System.out.println(msj + tutar);
            }
        } else if (yas > 0 && km > 0 && tip == 2) {
            if (yas < 12) {
                double tutar2 = tutar - (tutar * 0.5);
                double tuutar11 = tutar2 - (tutar2 * 0.2);
                System.out.println(msj + 2 * tuutar11);
            } else if (yas < 24 && yas > 12) {
                double tutar3 = tutar - (tutar * 0.1);
                double tutar12 = tutar3 - (tutar3 * 0.2);
                System.out.println(msj + 2 * tutar12);
            } else if (yas > 65) {
                double tutar4 = tutar - (tutar * 0.3);
                double tutar13 = tutar4 - (tutar4 * 0.2);
                System.out.println(msj + 2 * tutar13);
            } else {
                System.out.println(msj + 2 * tutar);
            }
        }
    }
}








