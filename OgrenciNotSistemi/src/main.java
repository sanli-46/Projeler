public class main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Alperen","05465213256","Matematik","Sozlu");
        Teacher t2=new Teacher("Beyza","05468579564","Tarih","Sozlu");
        Teacher t3=new Teacher("Gupse","05465879896","Felsefe","Sozlu");


        Corse matematik=new Corse("Matematik","101","Matematik","Sozlu");
        matematik.addTeacher(t1);
        Corse tarih=new Corse("Tarih","202","Tarih","Sozlu");
          tarih.addTeacher(t2);
       Corse feslefe=new Corse("Felsefe","303","Felsefe","Sozlu");
            feslefe.addTeacher(t3);
        Corse sozlu=new Corse("Sozlu","010","Sozlu","Sozlu");
        sozlu.addTeacher(t2);


        Student s1=new Student("saban","458","2",matematik,tarih,feslefe,sozlu);
        s1.addBulkExemNote(100,90,100,0);
        s1.isPass();
        Student s2=new Student("necmi","456","3",matematik,tarih,feslefe,sozlu);
        s2.addBulkExemNote(27,68,100,60);
        s2.isPass();
    }
}
