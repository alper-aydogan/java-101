import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("kaç kg elma aldınız:");
        double elma=tara.nextDouble();
        double elmaKG=3.67;
        System.out.println("kaç kg armut aldınız:");
        double armut= tara.nextDouble();
        double armutkg=2.14;
        System.out.println("kaç kg dpmates aldınız:");
        double domates= tara.nextDouble();
        double domateskg=1.11;
        System.out.println("kaç kg muz aldınız:");
        double muz= tara.nextDouble();
        double muzkg=0.95;
        System.out.println("kaç kg patlıcan aldınız:");
        double patlıcan= tara.nextDouble();
        double patlıcankg=5.00;
double toplamelma=elma*elmaKG;
        System.out.println(toplamelma);
double toplamarmut=armut*armutkg;
        System.out.println(toplamarmut);
double toplamdomates=domates*domateskg;
        System.out.println(toplamdomates);
double toplammuz=muz*muzkg;
        System.out.println(toplammuz);
double toplampatlıcan=patlıcan*patlıcankg;
        System.out.println(toplampatlıcan);
        double toplamHesap=toplamarmut+toplamdomates+toplammuz+toplamelma+toplampatlıcan;
        System.out.println(toplamHesap);



    }
}
