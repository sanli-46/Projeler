import  java.util.Scanner;
public class uckeninAlani {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a,b,c;


        System.out.print("1.Kenar Uzunlugunu Girin :");
        a= src.nextInt();
        System.out.print("2.Kenar Uzunlugunu Girin :");
        b= src.nextInt();
        System.out.print("3.Kenar Uzunlugunu Girin :");
        c=src.nextInt();


        int cevre=a+b+c;
        double u =cevre/2;
        double Alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Uckenin Alani :");
        System.out.format("%.2f",Alan );
    }
}
