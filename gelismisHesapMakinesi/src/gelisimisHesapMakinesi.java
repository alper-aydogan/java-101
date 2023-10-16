import java.util.Scanner;

public class gelisimisHesapMakinesi {
    static int top(int a, int b) {
        int result = a + b;
        System.out.println("toplam:" + result);
        return result;
    }

    static int çıakrma(int a, int b) {
        int result = a - b;
        System.out.println("çıkarma;" + result);
        return result;
    }

    static double bölme(int a, int b) {
        if (b==0){
            System.out.println("***ikinci sayı 0 dan büyük olmalı***");
            return 0;
        }
        double result = a / b;
        System.out.println("bölme işlemi:" + result);
        return result;
    }

    static int çarpma(int a, int b) {
        int result = a * b;
        System.out.println("çarpma:" + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("mod alma işlemi:" + result);
        return result;
    }

    static int kenar(int a, int b) {
        int result = 2 * a + 2 * b;
        System.out.println("dikdörtgenin çevresi:"+result);
        return result;
    }

    //
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menü = "0.işlem çıkış yapınız:\n"+"1.toplama işlemi:\n" +
                "2.çıkrma işlemi:\n" +
                "3.bölme işlemi:\n" +
                "4.çarma işlemi\n" +
                "5.mod alma işlemi:\n" +
                "6.dikdötrtgen çevresi hesaplama\n" +
                "0.çıkış yap";
        System.out.println(menü);
        while (true) {
            System.out.print("bir işlem seçiniz:");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.println("ilk sayıyı giriniz:");
            int a = scan.nextInt();
            System.out.println("ikinci sayıyı giriniz:");
            int b = scan.nextInt();
            switch (select) {
                case 1:
                    top(a, b);
                    break;
                case 2:
                    çıakrma(a, b);
                    break;
                case 3:
                    bölme(a, b);
                    break;
                case 4:
                    çarpma(a, b);
                    break;
                case 5:
                    mod(a, b);
                    break;
                case 6:
                    kenar(a, b);
                    break;
                case 0:
                    System.out.println("güle güle");
                default:
                    System.out.println("geçersiz işlem");
            }

        }


    }
}
