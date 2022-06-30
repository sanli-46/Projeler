import java.util.Scanner;
public class burcHesaplama {
    public static void main(String[] args) {
        int ay,gun;
        boolean isError=true;
        String burc="";
        Scanner src=new Scanner(System.in);
        System.out.printf("Dogum ayinizi giriniz :");
        ay=src.nextInt();
        System.out.printf("Dogum gununuzu giriniz :");
        gun= src.nextInt();


         if(ay==1){
            if(gun>0 && gun<22){
                burc="Oglak";
            } else if (gun>21 && gun<31) {
                burc="Kova";
                
            }else {
                isError=false;
            }
        }  else if(ay==2){
             if(gun>0 && gun<20){
                 burc="Kova";
             } else if (gun>19 && gun<28) {
                 burc="Bakli";

             }else {
                 isError=false;
             }
         }  else if(ay==3){
             if(gun>0 && gun<21){
                 burc="Balik";
             } else if (gun>20 && gun<31) {
                 burc="Koc";

             }else {
                 isError = false;
             }
         }  else if(ay==4){
             if(gun>0 && gun<21){
                 burc="Koc";
             } else if (gun>20 && gun<30) {
                 burc="Boga";

             }else {
                 isError=false;
             }
         }  else if(ay==5){
             if(gun>0 && gun<23){
                 burc="Boga";
             } else if (gun>22 && gun<31) {
                 burc="Ikizler";

             }else {
                 isError=false;
             }
         }  else if(ay==6){
             if(gun>0 && gun<23){
                 burc="Ikizler";
             } else if (gun>22 && gun<30) {
                 burc="Yengec";

             }else {
                 isError=false;
             }
         }  else if(ay==7){
             if(gun>0 && gun<23){
                 burc="Yengec";
             } else if (gun>22 && gun<31) {
                 burc="Aslan";

             }else {
                 isError=false;
             }
         }  else if(ay==8){
             if(gun>0 && gun<24){
                 burc="Aslan";
             } else if (gun>23 && gun<31) {
                 burc="Basak";

             }else {
                 isError=false;
             }
         }  else if(ay==9){
             if(gun>0 && gun<24){
                 burc="Basak";
             } else if (gun>23 && gun<30) {
                 burc="Terazi";

             }else {
                 isError=false;
             }
         }  else if(ay==10){
             if(gun>0 && gun<24){
                 burc="Terazi";
             } else if (gun>23 && gun<31) {
                 burc="Akrep";

             }else {
                 isError=false;
             }
         }  else if(ay==11){
             if(gun>0 && gun<22){
                 burc="Akrep";
             } else if (gun>21 && gun<30) {
                 burc="Yay";

             }else {
                 isError=false;
             }
         }  else if(ay==12){
             if(gun>0 && gun<22){
                 burc="Yay";
             } else if (gun>21 && gun<31) {
                 burc="Oglak";

             }else {
                 isError=false;
             }
         }else {
             System.out.printf("Degerler hatali . Tekrar Deneyin");
         }
         if (isError = false){
          System.out.printf("Hata! Gecersiz bir sayi girdiniz"+isError);

         }else
             System.out.printf("Burcunuz :"+burc);
    }


}
