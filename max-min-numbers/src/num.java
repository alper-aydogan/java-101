import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı1 giriniz:");
        System.out.println("sayı2 giriniz:");
        System.out.print("sayı 3 giriniz:");

        int sayı1 = scan.nextInt();
        int sayı2 = scan.nextInt();
        int sayı3 = scan.nextInt();
        int max = sayı1;
        if (sayı1 < sayı2 && sayı2 > sayı3) {
            System.out.println("en büyük sayı :" + sayı2);
        }
        if (sayı1 < sayı3 && sayı3 > sayı2) {
            System.out.println(("en büyük sayı:" + sayı3));
        }


    }
}
