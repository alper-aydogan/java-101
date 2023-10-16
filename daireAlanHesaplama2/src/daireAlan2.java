import java.util.Scanner;

public class daireAlan2 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("yarıçapını giriniz:");
        int r= tara.nextInt();
        System.out.println("açı ölçüsünü girninz:");
        double a= tara.nextDouble();
        double alan=(Math.PI*(r*r)*(a/360));
        System.out.println("dairenin alanı:"+alan);



    }
}
