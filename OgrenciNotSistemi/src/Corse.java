public class Corse {
    Teacher corseTeacher;
    String name;
    String prefix;

    String soz;
    String code;
    int note;

    Corse(String name,String code,String prefix,String soz){
        this.name=name;
        this.soz=soz;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }
    void  addTeacher(Teacher corseTeacher){
          if (corseTeacher.branch2.equals(this.soz )||corseTeacher.branch.equals(this.prefix)){
              this.corseTeacher=corseTeacher;

          }else {
              System.out.println(" Ogretmen bu dersi vermiyor !!");
          }

    }
    void print(){
        this.corseTeacher.print();
    }

}
