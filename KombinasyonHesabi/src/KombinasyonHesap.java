import java.util.Scanner;
public class KombinasyonHesap {
    public static void main(String[] args) {
        int n ,Fak=1,r,Fak1=1,Comb,k,Fak2=1;

        Scanner src=new Scanner(System.in);
        System.out.printf("n :");
        n= src.nextInt();

        System.out.printf("r :");
        r= src.nextInt();

        for(int i=1;i<=n;i++){
            Fak=Fak*i;
        }

        for(int j=1;j<=r;j++) {

            Fak1 = Fak1 * j;
        }

        /*  n! / (r! * (n-r)!)*/
       k=n-r;

       for (int l=1;l<=k;l++){
           Fak2= Fak2 * l;
       }
        Comb=(Fak / ( Fak1 * Fak2));
        System.out.printf("Combinasyonu :"+Comb);
    }
}
