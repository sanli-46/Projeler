import java.util.Scanner;
public class Ussu {
    public static void main(String[] args) {
        int a,b,total=1;
        Scanner src=new Scanner(System.in);
        System.out.printf("Ussu aninacak sayi :");
        a= src.nextInt();
        System.out.printf("Us olacak  sayi :");
        b= src.nextInt();

        for (int i=1;i<=a;i++){
            total*=b;
        }
        System.out.printf("Cevap :"+total);

    }
}
