import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizi kac elemanli olacak ?  :");
        int uzunluk=inp.nextInt();
        int[] list1=new int[uzunluk];

        System.out.println("Dizi Elemanlarini Giriniz");

          for (int i = 0; i < list1.length ; i++){
              System.out.print((i+1)+".Eleman :");
              list1[i]=inp.nextInt();
          }
              System.out.print("Girilen dizi   :");
        System.out.println("Siralama :"+Arrays.toString(list1));
        Arrays.sort(list1);
        System.out.print("Siralanan dizi   :");
        System.out.println("Siralama :"+Arrays.toString(list1));
    }
}
