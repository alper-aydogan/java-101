import java.util.Scanner;

public class hipotenusHesaplama {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluğunu giriniz:");
        double kenar1= tara.nextDouble();
        System.out.println("lütfen üçgenin kenar uzunluğunu giriniz:");
        double kenar2= tara.nextDouble();
double hipotenüs=Math.sqrt((kenar2*kenar2)+(kenar1*kenar1));
        System.out.println("üçgenin hipotenüs uzunluğu:"+hipotenüs);








    }
}
