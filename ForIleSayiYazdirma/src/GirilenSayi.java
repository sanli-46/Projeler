import java.util.Scanner;
public class GirilenSayi {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int k, toplam = 0;
        double sayi = 0;

        System.out.printf("Bir Sayi Giriniz :");
        k = src.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 4 == 0 && i % 3 == 0) {
                sayi+=i;
                toplam ++;
            }
        }
        System.out.print(   "Ortalama :" + (sayi /toplam));
    }
}
