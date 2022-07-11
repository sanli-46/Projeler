public class Teacher {
    String name;
    String pon;
    String branch;
    String branch2;

     Teacher(String name,String pon,String branch,String branch2){
          this.name=name;
          this.pon=pon;
          this.branch=branch;
          this.branch2=branch2;
    }
    void print(){
        System.out.println("Adi :"+this.name);
        System.out.println("Telefon numarasi :"+this.pon);
        System.out.println("Bolumu  :"+this.branch);
    }
}
