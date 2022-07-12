public class main {
    public static void main(String[] args) {
           Players p1=new Players("Hayri",100,10,35);
           Players p2=new Players("Gupse",100,10,35);

           Ring ring=new Ring(p1,p2);
           ring.StartRun();
    }
}
