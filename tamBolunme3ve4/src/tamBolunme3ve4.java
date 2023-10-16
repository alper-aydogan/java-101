import java.util.Scanner;

public class tamBolunme3ve4 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int sayi= tara.nextInt();
        int sayaç=0;
        for (;sayaç<=sayi;sayaç++) {
            if (sayaç%12==0){
                System.out.println(sayaç);
            }

        }












    }
}
