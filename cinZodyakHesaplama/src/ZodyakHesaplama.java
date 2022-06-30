import java.util.Scanner;
public class ZodyakHesaplama {
    public static void main(String[] args) {
        int yil,kalan;
        Scanner src=new Scanner(System.in);
        System.out.printf("Dogum yilinizi girin :");
        yil= src.nextInt();
           kalan=yil %12;
        System.out.printf("Cin Burcunuz :");
        switch (yil % 12){

            case  0:
                System.out.printf("Maymun");
                break;
            case  1:
                System.out.printf("Horoz");
                break;
            case  2:
                System.out.printf("Kopek");
                break;
            case  3:
                System.out.printf("Domuz");
                break;
            case  4:
                System.out.printf("Fare");
                break;
            case  5:
                System.out.printf("Okuz");
                break;
            case  6:
                System.out.printf("Kaplan");
                break;
            case  7:
                System.out.printf("Tavsan");
                break;
            case  8:
                System.out.printf("Ejderha");
                break;
            case  9:
                System.out.printf("Yilan");
                break;
            case  10:
                System.out.printf("At");
                break;
            case  11:
                System.out.printf("Koyun");
                break;
        }
    }
}
