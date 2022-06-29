import java.security.DrbgParameters;
import java.util.Scanner;
public class KdvHesap {
    public static void main(String[] args) {

        int Fiyat;
        double Kdv =0.18,Toplam;
        Scanner scv= new Scanner(System.in);

        System.out.print("Urun Fiyatini Girin:");

        Fiyat=scv.nextInt();

          double kdvOrani=Fiyat*Kdv;

        System.out.println("Kdv Tutari:"+kdvOrani);

        Toplam=Fiyat-kdvOrani;
        System.out.println("Kdvsiz Fiyati :"+Toplam);





    }
}
