import java.util.Scanner;

public class üsHesaplama {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.println("üssünü alacağınız sayıyı girin:");
        int a = tara.nextInt();
        System.out.println("üs olacak sayıyı giriniz:");
        int b = tara.nextInt();
        int i = 1;
        int total = 1;

        while (i<=b) {
            total*=a;
            i++;
        }
        System.out.println("cevap:"+total);




    }
}

