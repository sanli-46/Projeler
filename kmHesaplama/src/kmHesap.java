import java.util.Scanner;
import java.util.SortedMap;

public class kmHesap {
    public static void main(String[] args) {
        int km;
        double baskm=2.20,total=10;
        Scanner srd=new Scanner(System.in);
        System.out.print("KM girin :");
        km= srd.nextInt();

        total += km*baskm;
        total =(20 >total )? 20.0 :total;

        System.out.printf("Ucret :"+ total);

    }

}
