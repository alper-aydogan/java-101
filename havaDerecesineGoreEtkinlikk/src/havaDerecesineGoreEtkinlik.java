import java.util.Scanner;

public class havaDerecesineGoreEtkinlik {
    public static void main(String[] args) {
       Scanner tara=new Scanner(System.in);
        System.out.println("hava derecesini girininz:");
        double heat= tara.nextDouble();
        if (heat<5){
            System.out.println("kayak kaymaya gidebilirsiniz");
        }   if (5<=heat && heat<15){
            System.out.println("sinemaya gidebilrisiniz");
                }if (15<=heat && heat<25) {
            System.out.println("pikniğe gidebilirsinini");
        }if (heat>25){
            System.out.println("yüzmeye gidebilirsinziniz");
        }


    }
}
