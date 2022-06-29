import java.util.Scanner;
public class kucuksayi {
    public static void main(String[] args) {
        int a,b,c;
        Scanner src=new Scanner(System.in);

        System.out.printf("Bir sayi girin :");
        a= src.nextInt();
        System.out.printf("Bir sayi girin :");
        b=src.nextInt();
        System.out.printf("Bir sayi girin :");
        c= src.nextInt();
        if(a>b && b>c){
            if (b>c) {
                System.out.printf( c+"<"+b+"<"+a);
            }else{
                System.out.printf(c+"<"+b +"<"+a);

            }
        } else if (b>a && b>c) {
            if (a>b){
                System.out.printf(c+"<"+a+"<"+b);
            }else {
                System.out.printf(a+"<"+c+"<"+b);
            }

        } else if (c>b && c>a) {
            if (a>b){
                System.out.printf(b+"<"+a+"<"+c);
            }else {
                System.out.printf(a+"<"+b+"<"+c);
            }

        }


    }
}
