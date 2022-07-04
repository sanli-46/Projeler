import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.printf("3 basamakli bir sayi giriniz :");
        int a =src.nextInt();
        int fakea=a;
        int basamaknumara=0;
        int basdeger;
        int total=0;


        if (a >99 &&a<1000) {
        while(fakea!=0){

            fakea/=10;
            basamaknumara++;
        }
        fakea=a;
        while (fakea!=0) {
            basdeger=fakea%10;
            int basus=1;
            for (int i=1;i<=basdeger;i++){
                basus*=basdeger;

            }
            total+=basus;
            fakea/=10;
        }
        if (total==a){
            System.out.println("Armstrong bir sayi ,"+total);
        }else {
            System.out.println("Armstrong degil !!!"+total);
        }

        }else {
            System.out.printf("3 basamali biir sayi girin !");
        }

   /*
 ////////////////////////////////////////////////////////////////////////////////////////////////////
    Scanner src=new Scanner(System.in);
        System.out.printf("Sayiyi girin :");
     int number= src.nextInt();
     int basnumber=0,tempnumber=number,basvalue,result=0,basamakpow;


     while (tempnumber!=0){
         tempnumber/=10;
         basnumber++;
     }
     tempnumber=number;
     while (tempnumber!=0){
         basvalue=tempnumber%10;
         basamakpow=1;
        for(int i=1; i<=basnumber;i++){
            basamakpow*=basvalue;
        }
        result+=basamakpow;
         tempnumber/=10;

     }
       if (result==number){
           System.out.println("Armstrong basamak sayisidir ."+result);
       }else {
           System.out.println("Armstrong sayi degildir ."+result);
       }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int a=2546,basamakSasyisis=0;
        //Basamak sayısı bulma .
          while(a != 0){
              a/=10;
                  basamakSasyisis++;

          }
          // Son basamagı  bulma.
          //2546%10=6
        int b = 2546;
        int c = b%10;

//Us alma işlemi.
        int result=1;
        int sub=2,sup=3;
        for (int i=1; i<=sup;i++){
            result*=sub;
        }*/









    }
}
