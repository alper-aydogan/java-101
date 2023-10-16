import java.util.Scanner;
//sayimizin
public class asalsayi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("sayi giriniz:");
       int sayi= tara.nextInt();
       int x=sayi-1;
       int faktöriyel=1;
        for (;x==1;x--){
            faktöriyel=sayi*x;
        }System.out.println(faktöriyel);



     }



    }





