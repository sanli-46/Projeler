import java.util.Arrays;

public class Frekans {
    public static void main(String[] args) {
         int []list={10,20,20,10,10,20,5,20};
         Arrays.sort(list);
         int s ;
         for (int i=0;i<list.length;i++){
             s=1;
             for (int j=0;j<list.length;j++){
                 if (i!=j && list[i]==list[j]) {
                     s++;
                 }
             }
                      if (i==list.length-1||list[i]!=list[i+1]){
                          System.out.println(list[i]+".Eleman  "+s+" kez tekrar ediyor.");
                      }
         }



    }
}
