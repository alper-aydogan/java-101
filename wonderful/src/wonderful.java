import java.util.Scanner;

public class wonderful {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int sayi = scan.nextInt();
        int total = 0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                total+=i;
            }
        }
     if (total==sayi){
         System.out.println(sayi+"sayısı mükemmel sayıdır");
     }else {
         System.out.println(sayi+"mükemmel sayısı değildir");
     }

    }
}





