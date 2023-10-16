import java.util.Scanner;

public class çiftSayılar {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int sayi1 = tara.nextInt();
        int sayi2 = 0;
        for (sayi2 = 0; sayi2 < sayi1; sayi2++) {
            if (sayi2 % 2 == 0) {
                System.out.println(sayi2);


            }
        }
    }
}