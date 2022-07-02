import java.util.Scanner ;
public class DortVeBes {
    /* Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
    public static void main(String[] args) {
        int a = 0;
        Scanner input=new Scanner(System.in);
        a= input.nextInt();
        for (int i=1; i<=a;i*=4  ){
            System.out.printf(i+"  ");
        }
        System.out.printf("\n");
        for ( int j=1;j<=a;j*=5){

            System.out.print(j+"  ");
        }


    }
}
