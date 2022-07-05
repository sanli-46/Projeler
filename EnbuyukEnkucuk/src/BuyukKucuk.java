import java.util.Scanner;
public class BuyukKucuk {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int  counter,min=1,max=1;

        System.out.print("Kac numara gireceksiniz :");

        counter = scr.nextInt();
        {

            for (int i = 1; i <= counter; i++) {

                System.out.print(i + ".Sayiyi girin :");

               int  numara = scr.nextInt();

                if (i == 1) {
                    max = numara;
                    min = numara;

                }
                if (numara < min) {
                    min = numara;
                }
                    if (numara > max) {
                    max = numara;
                }

            }
            System.out.println("En Buyuk :" + max);
            System.out.println("En Kucuk :" + min);

        }
    }
}