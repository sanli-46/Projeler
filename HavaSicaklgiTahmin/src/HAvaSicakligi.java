import java.util.Scanner;
public class HAvaSicakligi {
    public static void main(String[] args) {
        int hava;
        Scanner src=new Scanner(System.in);

        System.out.printf("HAVA SICAKLIGINI BELIRLEMEK ICIN BIR NUMARA GIRIN :");

        System.out.printf("\n 1= 0-5C \n 2= 5-10C \n 3= 10-15C \n 4= 15-25C\n");
        hava= src.nextInt();
        switch (hava){
            case 1 :
                System.out.printf("evden cikma");
            break;
            case 2:
                System.out.printf("evden az cik");
            break;
            case 3:
                System.out.printf("Bahceye cik");
                break;
            case 4:
                System.out.printf("Yuzmek  icin guzel bir gun ");
                break;
            default:
                System.out.printf("Hatali Tuslama Yaptin : \n Hava 0 in altindaysa evden kesinlikle cikma \n Hava 25 in ustunde ise sapka ve su al yanina kesinlikle ");
        }
    }


}
