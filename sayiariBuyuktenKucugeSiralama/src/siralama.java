import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.println("sayı1 girninz:");
        int sayi1 = tara.nextInt();
        System.out.println("sayı2 girninz:");
        int sayi2 = tara.nextInt();
        System.out.println("sayı3 girninz:");
        int sayi3 = tara.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3){

        System.out.println("sayi1>sayi2>sayi3");}
         else{
            System.out.println("sayi1>sayi3>sayi2");
        }
    } else if(sayi2 >sayi1 &&sayi2 >sayi3)
    {
        if (sayi1 > sayi3) {
            System.out.println("sayi2>sayi1>sayi3");
        } else {
            System.out.println("sayi2>sayi3>sayi1");
        }

    }else{
            if (sayi1>sayi2){
                System.out.println("sayi3>sayi1>sayi2");}
            else {
                System.out.println("sayi3>sayi2>sayi1");

            }
        }


}
}