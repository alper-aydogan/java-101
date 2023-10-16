import java.util.Scanner;

public class cinZodyagıHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("hangi yıl doğduğunuzu giriniz:");
        String msj="zodyak yılınız:";
        int yıl= input.nextInt();
        int kalan=yıl%12;
        switch (kalan) {
            case 0:
                System.out.println(msj+"maymun");
                break;
            case 1:
                System.out.println(msj+"horoz");
                break;
            case 2:
                System.out.println(msj+"köpek");
                break;
            case 3:
                System.out.println(msj+"domuz");
                break;
            case 4:
                System.out.println(msj+"fare");
                break;
            case 5:
                System.out.println(msj+"öküz");
                break;
            case 6:
                System.out.println(msj+"kaplan");
                break;
            case 7:
                System.out.println(msj+"tavşan");
                break;
            case 8:
                System.out.println(msj+"ejderha");
                break;
            case 9:
                System.out.println(msj+"yılan");
                break;
            case 10:
                System.out.println(msj+"at");
                break;
            case 11:
                System.out.println(msj+"koyun");
                break;
            default:
                System.out.println("yanlış sayı girdiniz");

        }









    }

}



