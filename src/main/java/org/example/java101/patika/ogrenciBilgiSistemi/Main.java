package org.example.java101.patika.ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","TRH","05443638139");
        Teacher t2=new Teacher("Graham Bell","FZK","000");
        Teacher t3=new Teacher("kül yutmaz","BIO","12");

        Course tarih=new Course("tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo=new Course("biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("inek şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(50,50,90,30,20,30);
        s1.ispass();

        Student s2=new Student("düdük necmi","1234","4",tarih,fizik,biyo);
        s2.addBulkExamNote(40,30,30,20,20,20);
        s2.ispass();
    }
}
