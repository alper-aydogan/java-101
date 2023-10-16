import java.util.Scanner;

public class kullanıcıGirisi {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
            String username;
            int password;
        System.out.println("lütfen username giriniz:");
        username=tara.nextLine();
        System.out.println("lütfen password girniz:");
        password= tara.nextInt();
        if (username.equals("alper")&&password==123) {
            System.out.println("giriş yaptınız");
        } else if (username.equals("alper") && password!=123) {
            System.out.println("şifreyi yanlış girdiniz");
            System.out.println("sıfırlamak için 1 e basınız");
            int a=tara.nextInt();
            switch (a){
                case 1:
                    System.out.println("yeni şifrenizi giriniz:");
                   int ysifre= tara.nextInt();
                   if (ysifre==123){
                       System.out.println("eski şifre ile aynı olamaz yeniden şifre oluşturun");
                   }else {
                       System.out.println("yeni şifre oluşturuldu:");
                   }
            }
        }
    }
}
