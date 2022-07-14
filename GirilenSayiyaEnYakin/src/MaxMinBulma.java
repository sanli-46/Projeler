import java.util.Arrays;
import java.util.Scanner;
public class MaxMinBulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int[]list={15,12,788,1,-1,-778,2,0};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);

        System.out.print("Girilen Sayi  :");
        int a= inp.nextInt();

           int b=list[0];
           int c=list[0];

           System.out.println("================");

               for (int k:list){
                if (k<a){
                    b=k;
                }
                if (k>a){
                    c=k;
                    break;
                }
               }


        System.out.print(b+" "+c);
    }
}
