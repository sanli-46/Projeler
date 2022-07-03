import java.util.Scanner;
public class BasamakToplami {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int sayi,n=0,i,total=0;

        System.out.printf("Bir sayi giriniz :");

        sayi= src.nextInt();

        for (i=0;sayi>0;i++){
            n=sayi%10;
           total=total+n;
           sayi=sayi/10;
        }
        System.out.printf("Rakamlarin Toplami :"+total);


    
    }
}
