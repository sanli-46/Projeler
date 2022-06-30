import java.util.Scanner;
import java.util.SortedMap;

public class UcakBileti {
    public static void main(String[] args) {
        /* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/


        int mesafe, ytipi;
        double yas,toplam,iToplam = 0;
        Scanner src = new Scanner(System.in);
        System.out.printf("Mesafe Bilgisi-Km : ");
        mesafe = src.nextInt();
        System.out.printf("Yasiniz :");
        yas = src.nextInt();
        System.out.printf(" 1-Tek Yon \n 2-Gidis/Donus \nYolculuk tipi : ");
        ytipi = src.nextInt();

        toplam=mesafe*0.10;
        System.out.printf("Toplam Tutar :"+toplam +"\n");

        if (mesafe < 0) {
            System.out.printf("Hatali Veri Girdiniz !");
        } else if (yas < 0) {
            System.out.printf("Hatali Veri Girdiniz !");
        } else if (ytipi < 1 || ytipi > 2) {
            System.out.printf("Hatali Veri Girdiniz !");
        }

        if (yas > 0 && yas < 12 ) {
            if (ytipi==2){
                iToplam= (toplam *0.5 )+(toplam*0.20);
            }else
             iToplam= toplam *0.5 ;
        } else if (yas >= 12 && yas < 24) {
            if (ytipi==2){
                iToplam= (toplam *0.10 )+(toplam*0.20);
            }else
                iToplam= toplam *0.10 ;
        } else if (yas >= 65 ) {
            if (ytipi==2){
                iToplam= (toplam *0.3 )+(toplam*0.20);
            }else
                iToplam= toplam *0.3 ;
        }
        if(ytipi==2){
            iToplam=toplam*0.20;

        }


        System.out.printf("indirim :"+iToplam+"\n");

          double son;
          son=toplam-iToplam;
        System.out.printf("Indirimli Toplam"+son);
        }

    }
