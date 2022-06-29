import java.util.Scanner;
public class kdvhesapl {
    public static void main(String[] args) {
        double Fiyat,kdv,kdvsiz,kalan;



        Scanner scr=new Scanner(System.in);
        System.out.println("Fiyati girin");
        Fiyat= scr.nextDouble();

        boolean kdvdurum=(0<Fiyat )&&(1000>Fiyat);
         kdv=kdvdurum? 0.18:0.08;
         System.out.println("KDV :"+kdv);
          kdvsiz=Fiyat*kdv;
         System.out.println("KDV Orani:"+kdvsiz);
         kalan=Fiyat-kdvsiz;
          System.out.println("KDVSIZ tutar :"+kalan);

    }

}
