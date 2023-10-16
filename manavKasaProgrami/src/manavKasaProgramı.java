import java.util.Scanner;

public class manavKasaProgramı {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("lütfen kaç kg  elma aldınığınızı giriniz:");
        double elmakg= tara.nextDouble();
        double elmakgFiyat=3.67;
        double elmatutar=elmakgFiyat*elmakg;
        System.out.println("elmalar toplam."+elmatutar+"tl");
        Scanner tara1=new Scanner(System.in);
        System.out.println("lütfen kaç kg  armut aldınığınızı giriniz:");
        double armutg= tara1.nextDouble();
        double armutkgFiyat=2.14;
        double armuttutar=elmakgFiyat*elmakg;
        System.out.println("armut toplam."+armuttutar+"tl");
        Scanner tara2=new Scanner(System.in);
        System.out.println("lütfen kaç kg  domates aldınığınızı giriniz:");
        double domateskg= tara2.nextDouble();
        double domateskgFiyat=1.11;
        double domatestutar=elmakgFiyat*elmakg;
        System.out.println("elmalar toplam."+domatestutar+"tl");
        Scanner tara3=new Scanner(System.in);
        System.out.println("lütfen kaç kg  muz aldınığınızı giriniz:");
        double muzkg= tara.nextDouble();
        double muzkgFiyat=0.95;
        double muztutar=elmakgFiyat*elmakg;
        System.out.println("elmalar toplam."+muztutar+"tl");
        Scanner tara4=new Scanner(System.in);
        System.out.println("lütfen kaç kg  elma aldınığınızı giriniz:");
        double patlıcakg= tara4.nextDouble();
        double patlıcankgFiyat=5.00;
        double patlıcantutar=elmakgFiyat*elmakg;
        System.out.println("elmalar toplam."+patlıcantutar+"tl");
        Scanner tara5=new Scanner(System.in);
        System.out.println("toplam tutar:"+elmatutar+muztutar+patlıcantutar+domatestutar+armuttutar);
    }
}
