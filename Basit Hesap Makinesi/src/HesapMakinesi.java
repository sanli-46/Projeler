import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner src = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        n1= src.nextInt();
        System.out.println("Bir sayi daha giriniz :");
        n2= src.nextInt();

        System.out.println("1-Carpma,2-Cikarma,3-Bolme,4-Toplama");
        System.out.println("Bir numara secin :");
        select= src.nextInt();

        switch (select){
            case 1:
                System.out.printf("Sonuc :"+(n1*n2));
                break;
            case 2:
                System.out.printf("Sonuc :"+(n1-n2));
                break;
            case 3:

                if (n2!=0){
                    System.out.printf("Sonuc :"+(n1/n2));
                }else {
                    System.out.printf("Bir sayinin sifira bolumu sonucsuzdur.Tekrar Deneyin!!!");
                }
                break;
            case 4:
                System.out.printf("Sonuc :"+(n1+n2));
                break;
            default:
                System.out.printf("Yanlis bir deger girdiniz.Tekrar Deneyin ! ");

        }


    }



}
