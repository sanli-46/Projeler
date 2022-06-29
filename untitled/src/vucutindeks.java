import java.util.Scanner;
public class vucutindeks {
    public static void main(String[] args) {
        double Boy,Kilo,Vk;
        Scanner klo=new Scanner(System.in);

        System.out.printf("Lulfen Kilonuzu  giriniz :");
        Kilo=klo.nextDouble();
        System.out.printf("Lutfen Boyunuzu Metre cinsinden giriniz :");
        Boy=klo.nextDouble();

        Vk=Kilo/(Boy*Boy);
        System.out.printf("Vucut Kitle Endeksi :"+Vk);
    }
}
