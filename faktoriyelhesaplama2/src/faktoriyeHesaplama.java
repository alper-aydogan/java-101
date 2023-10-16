import java.util.Scanner;

public class faktoriyeHesaplama {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("faktöriyel sayısını girniz:");
        int faktöriyel= tara.nextInt();
        int i=1;
        int total=1;
        for (;i<=faktöriyel;i++){
        total = total*i;
        System.out.println(+faktöriyel +".faktöriyel:"+total);











    }

} }
