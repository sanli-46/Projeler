import java.util.Scanner;


public class Polindirom {
    static boolean isPol(int number){

        int temp = number,newnumber=0,lastnumber;
        while(temp!=0){
          lastnumber= temp % 10;
          newnumber=(newnumber*10)+lastnumber;
          temp/=10;

        }
            if ( number == newnumber) {
                System.out.println(number + "  Polindrom bir sayididr");
                return true;
            }else{
                System.out.println(number+"  Polindrom sayi degildir");
                return false;
            }
    }
    public static void main(String[] args) {

        Scanner scr=new Scanner(System.in);
        System.out.print("Bir sayi girniz :");

        int a=scr.nextInt();

        isPol(a);



    }
}
