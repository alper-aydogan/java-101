import java.util.Scanner;

public class artıkYil {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("lütfen yıl girin:");
        int yil= tara.nextInt();
        if (yil%100==0 && yil%400==0) {
            System.out.println("artık yıldır:" + yil);
        }else if (yil%4==0) {
                System.out.println("artık yıldır:"+yil);
            }else {
            System.out.println("artık yıl değildir:"+yil);
        }
        }



    }

