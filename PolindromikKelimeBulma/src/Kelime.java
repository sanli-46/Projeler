import java.util.Scanner;

public class Kelime {
    static Scanner inp=new Scanner(System.in);

    static boolean isPalindrom(String chr){
        int i=0;
        int j=chr.length()-1;
        while (i<j){
            if (chr.charAt(i) != chr.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Bir kelime girin :");
        String str= inp.nextLine();
        if (isPalindrom(str)){
            System.out.println("Bu kelime polindromdur .");
        }else {
            System.out.println("Bu kelime polindrom degildir !!!");
        }

    }
}
