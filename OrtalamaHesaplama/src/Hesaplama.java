import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {
        int mat,fiki,kimya;

        Scanner a=new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        mat=a.nextInt();


        System.out.print("Fizik notunuzu girin: ");
        fiki=a.nextInt();


        System.out.print("Kimya notunuzu girin: ");
        kimya=a.nextInt();

        int toplam=(mat+fiki+kimya);
        double sonuc = toplam  / 3;
        System.out.print("Sonuc"+sonuc);
        int b = 60;


        boolean kosul2 = b <= sonuc;
        String dd = kosul2 ?  "Sinifi Gecti":"Siniftan Kaldi ";
         System.out.println("\n"+dd);
    }
}
