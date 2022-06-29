import java.util.Scanner;
public class forml {
    double pi= 3.14,r,a, formul,alan,cevre;

    Scanner girdi = new Scanner(System.in);

        System.out.print("YARI CAPINI GIRINIZ =  ");
    r =girdi.nextDouble();

        System.out.print("YARI CAPINI GIRINIZ =  ");
    a=girdi.nextDouble();
    alan=(pi*r*r);
    cevre=2*pi*r;
    formul = ((pi*(r*r)*a)/360);
        System.out.println(formul);
        System.out.println("DAIRENIN ALANI"+cevre);
        System.out.println("DAIRENIN DILIM ALANI"+formul);
        System.out.println("DAIRENIN TAM ALANİ" + alan);

}
