import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner src = new Scanner(System.in);
        System.out.printf("Yili girin :");
        yil = src.nextInt();
        int kalan1=yil %400;
        switch (kalan1){
            case 0: System.out.printf("");
                break;
            default:
                System.out.printf(" ");

        }
        
        int kalan = yil % 4;
                        switch (kalan) {
                    case 0:
                        System.out.printf("Artik Yil");
                    break;
                        default:
                        System.out.printf("Artik Yil Degil ");
                }

    }

}
