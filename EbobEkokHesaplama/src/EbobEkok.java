import  java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n1,n2,r,ebob = 0,ekok;

            System.out.print("1.Sayiyi girin :");
            n1= src.nextInt();
            System.out.print("2.Sayiyi girin :");
            n2=src.nextInt();
            if (n2<n1){
                r=n2;
                } else {
                r=n1;
            }
            int i=r;
           while(i>=1){
              if (n1%i == 0  && n2%i ==0){
                  ebob=i;
                  System.out.println("Ebob :"+ebob);
                  break;
              }
               i--;
           }
           int j=1;
           while (j<=(n1*n2)){
               if (j%n1 == 0  && j%n2 ==0){
                   System.out.println("Ekok :"+j);
                   break;
               }
               j++;
           }

    }
    }

