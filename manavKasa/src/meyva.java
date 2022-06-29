import java.util.Scanner;
public class meyva {
    public static void main(String[] args) {
        double Armut,Elma,Domates,Muz,Patlıcan;
        double a=2.14,e=3.67,d=1.11,m=0.95,p=5.00;
        Scanner mnv=new Scanner(System.in);
        System.out.printf("Armut Kilo :");
        Armut= mnv.nextDouble();
        System.out.printf("Elma Kilo :");
        Elma=mnv.nextDouble();
        System.out.printf("Domates Kilo :");
        Domates= mnv.nextDouble();
        System.out.printf("Muz Kilo :");
        Muz= mnv.nextDouble();
        System.out.printf("Patlican Kilo :");
        Patlıcan= mnv.nextDouble();
Armut=a*Armut;
Elma=e*Elma;
Domates=d*Domates;
Muz=m*Muz;
Patlıcan=p*Patlıcan;
         double Toplam =Armut+Elma+Domates+Muz+Patlıcan;
        System.out.printf("Toplam :"+Toplam +" TL");
    }
}
