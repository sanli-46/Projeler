import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a= src.nextInt();

        double result=0.0;

        for (double i=1;i<=a;i++){
            result += (1/i);
        }
        System.out.println("Harmonik Deger :"+result);
    }
}
