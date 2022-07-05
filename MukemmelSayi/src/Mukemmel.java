import java.util.Scanner;
public class Mukemmel {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int a,toplam=0;
        do {
            System.out.print("Bir sayi giriniz :");
            a= scr.nextInt();
        for (int i=1;i<a;i++){
           if (a %i ==0){
               toplam+=i;
           }
        }
         if (a==toplam){
             System.out.println(a+" Mukemmel Sayidir.");
         }else {
             System.out.println(a+" Mukemmel sayi degildir !");
         }

        }while(a==a);
    }
}
