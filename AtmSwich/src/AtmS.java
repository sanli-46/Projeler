import java.util.Scanner;

public class AtmS {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        String userNAme,Passworld;
        int right=3,select ,balance=5000;
        while (right > 0) {
            System.out.print("Kullanici Adi :");
            userNAme= src.nextLine();
            System.out.print("Parola :");
            Passworld= src.nextLine();
            if (userNAme.equals("admin") &&Passworld.equals("admin123") ){
                System.out.println("Turkiye Bankasina Hosgeldiniz :)");
                 do {
                     System.out.println("1-Para Cekme\n" +
                             "2-Para yatirma\n" +
                             "3-Bakiye Sorgulama\n" +
                             "4-Cikis Yap ");
                     System.out.print("Bir Numara Secin :");
                        select=src.nextInt();
                     switch (select) {
                         case 1:
                             System.out.print("Tutari Girin :");
                             int deposit = src.nextInt();
                             balance -= deposit;
                             System.out.println("Kalan Bakiyeniz :" + balance);

                             break;
                         case 2:
                             System.out.print("Tutari Girin :");

                             int deposide = src.nextInt();
                             balance += deposide;
                             System.out.println("Bakiyeniz :" + balance);

                             break;
                         case 3:
                             System.out.println("Guncel bakiyeniz" + balance);
                             break;
                     }
                 }while (select!=4);
                System.out.println("Iyi Gunler.Tekrar Bekleriz :)");
                 break;
            }else {
                right--;
                if (right!=0){
                    System.out.println("Kullanici Adi veya Parola Yanlis.TEKRAR DENEYIN !!!");
                }else {
                    System.out.println("Hesabiniz bloke oldu. Bankanizla iletisime geciniz !!!");
                }
            }
        }
        }




    }

