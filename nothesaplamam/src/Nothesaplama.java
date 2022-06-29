import java.util.Scanner;
public class Nothesaplama {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;

        Scanner scr=new Scanner(System.in);
        System.out.printf("Matamatik notu :");
        Matematik=scr.nextInt();
        System.out.printf("Fizik notu :");
        Fizik=scr.nextInt();
        System.out.printf("Turkce notu :");
        Turkce=scr.nextInt();
        System.out.printf("Kimya notu :");
        Kimya=scr.nextInt();
        System.out.printf("Muzik notu :");
        Muzik=scr.nextInt();

        if (Matematik > 0 || Matematik < 100)
            Matematik = 0;
        if (Fizik > 0 || Fizik < 100)
            Fizik = 0;
        if (Kimya > 0 || Kimya < 100)
            Kimya = 0;
        if (Turkce > 0 || Turkce < 100)
            Turkce = 0;
        if (Muzik > 0 || Muzik < 100)
            Muzik = 0;

       double Ort=((Matematik+Fizik+Turkce+Muzik+Kimya)/5);
        System.out.println("Ortalama :"+Ort);
        if (Ort>=55){
            System.out.println("Gectiniz,Tebrikler :)");
        }else
            System.out.println("Kaldiniz ,Seneye Gorusuruz");





    }
}
