import java.util.Scanner;

public class demos {
    public static void main(String[] args) {
        int mat,kimya,biyoloji,fizik,türkçe;
        Scanner tara=new Scanner(System.in);
        System.out.println("lütfen mat notuzu giriniz:");
        mat= tara.nextInt();

        System.out.println("lütfen kimya notuzu giriniz:");
        kimya= tara.nextInt();

        System.out.println("lütfen fizik notuzu giriniz:");
        fizik= tara.nextInt();

        System.out.println("lütfen biyoloji notuzu giriniz:");
        biyoloji= tara.nextInt();

        System.out.println("lütfen türkçe notuzu giriniz:");
        türkçe= tara.nextInt();
int ortalama=(mat+fizik+biyoloji+kimya+türkçe)/5;
        System.out.println("ortalamanız:"+ortalama);






    }
}
