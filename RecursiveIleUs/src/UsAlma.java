import java.util.Scanner;
public class UsAlma {
    static int sonuc=1;
    static int usalma(int a,int b){
        if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        }
        sonuc *= a;
        usalma( a,b- 1);
        return sonuc;
    }
    public static void main(String[] args) {
     Scanner inp=new Scanner(System.in);
        System.out.print("taban gir :");
     int a= inp.nextByte();
        System.out.print("us gir :");
     int b= inp.nextInt();
        System.out.println(usalma(a,b));
    }
}
