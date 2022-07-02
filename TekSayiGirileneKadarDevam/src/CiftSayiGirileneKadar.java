import java.util.Scanner;
public class CiftSayiGirileneKadar {
    /* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
    public static void main(String[] args) {
        int a,total=0;
        Scanner src=new Scanner(System.in);

        do {
            System.out.printf("Bir sayi girin :");

            a= src.nextInt();

            if (a%2==0 && a%4==0){

                total+=a;

            }
        }while (a%2==0);
        System.out.printf("Toplam :"+total);
    }
}
