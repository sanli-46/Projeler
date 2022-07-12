public class Players {
    String name;
    int healty;
    int damage;
    Double dodge;

    public Players(String name , int healty ,int damage, double dodge){
        this.name=name;
        this.healty=healty;
        this.damage=damage;
        this.dodge=dodge;

    }
     public int hit(Players one){

         System.out.println(this.name+" =>"+this.damage+ "  Hasar verdi");
         if(one.dodge()){
             System.out.println("--------------------------------------");
             System.out.println(one.name+" hasardan kacti");
             System.out.println("--------------------------------------");

             return one.healty;
         }
         if (one.healty-this.damage<0){
             return 0;
         }
        return one.healty-this.damage;
    }

    public Boolean dodge() {
            double rondomValue=Math.random()*100;//0.00-0.99 arasında deger alır Math.random().
            return rondomValue <= this.dodge;
    }
    public boolean first(){
        double rondomValue=(int) Math.random()*100;//0.00-0.99 arasında deger alır Math.random().
        return rondomValue % 2 ==0;
    }
}
