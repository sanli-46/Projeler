import java.util.Scanner;
public class DesenGore {
/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/

    static int pattern(int n,String islem,int tempN) {
        // n>0 yaz n , n-5
        // n<0 yaz n , n+5
        if(n>0 && islem=="azalt"){
            System.out.print(n+" ");
            return pattern(n-5,islem,tempN);
        }else{
            islem="arttır";
            System.out.print(n+" ");
            if(n==tempN){
                return tempN;
            }else{
                return pattern(n+5,islem,tempN);
            }
        }
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n= input.nextInt();
        int tempN=n;
        String islem="azalt";
        pattern(n,islem,tempN);
    }
}

/*     if(a <=0)
        {



        System.out.print("Bir sayi girin :");
        int k=inp.nextInt();
        int a=k;
        for (int i=a;i>=0;i-=5){
            System.out.println("i"+i);
        }
        for (int j=0;j<=k;j+=5){

            System.out.println("j"+j);
        }*/
