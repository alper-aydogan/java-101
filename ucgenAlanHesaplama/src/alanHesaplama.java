import java.util.Scanner;

public class alanHesaplama {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunlularını giriniz:");
        int kenar1= tara.nextInt();
        int kenar2= tara.nextInt();
        int kenar3= tara.nextInt();
int u=(kenar1+kenar2+kenar3)/2;
double alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("üçgenin alanı:"+alan);



    }
}
