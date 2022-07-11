public class Student {
    Corse c1;
    Corse c2;
    Corse c3;

    Corse so;
    String name;
    String stuno;
    String classes;
    double avarage;
    boolean isPass;

   Student( String name,String stuno,String classes,Corse c1,Corse c2,Corse c3,Corse so){
       this.name=name;
       this.stuno=stuno;
       this.classes=classes;
       this.c1=c1;
       this.c2=c2;
       this.c3=c3;
        this.so=so;
       this.avarage=0.0;

       this.isPass=false;
   }
   void  addBulkExemNote(int note1,int note2,int note3,int soz){
     if (note1>=0 && note1<=100){
         this. c1.note=note1;
     }
       if (note2>=0 && note2<=100){
           this.c2.note=note2;
       }
       if (note3>=0 && note3<=100) {
           this. c3.note=note3;
       }
       if (soz>=0 && soz<=100) {
           this.so.note=soz;
       }
   }
   void isPass(){
       System.out.println("=======================================");
       this.avarage=(((this.c1.note*0.80)+(this.so.note*0.20))+((this.c2.note)+(this.so.note*0.20))+((this.c3.note)+(this.so.note*0.20)))/3.0;
       if (this.avarage>50){
           System.out.println("Tebrikler.Sinifi gectiniz.");
           this.isPass=false;
       }else {
           System.out.println("Kaldiniz.Seneye Gorusuruz!!!");
           this.isPass=true;
       }
       print();
   }
   void print(){

       System.out.println(this.c1.name+"Notu  ;"+this.c1.note);
       System.out.println(this.c2.name+"Notu  ;"+this.c2.note);
       System.out.println(this.c3.name+"Notu  ;"+this.c3.note);
       System.out.println(this.so.name+"Notu  ;"+this.so.note);
       System.out.println("Ortalam  :"+this.avarage);

   }



}
