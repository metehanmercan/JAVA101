package org.example.java101.patika.ogrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes, Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        isPass=true;

    }
    void addBulkExamNote(int note1,int note2,int note3,int sozlu1,int sozlu2,int sozlu3 ){
        if(note1>=0 && note1<=100){
            this.c1.note=note1;
        }
        if(note2>=0 && note2<=100){
            this.c2.note=note2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note=note3;
        }
        this.c1.sozlu=sozlu1;
        this.c2.sozlu=sozlu2;
        this.c3.sozlu=sozlu3;

    }
    void ispass(){
        printNote();
        this.avarage=((this.c1.note*0.50+this.c1.sozlu*0.50)+(this.c2.note*0.80+this.c2.sozlu*0.20)+(this.c3.note*0.70+this.c3.sozlu*0.30))/3.0;
        if (this.avarage>=50){
            System.out.println("hababam sınıfı uyanıyor!!  ortalama:"+this.avarage);
            isPass=true;
        }else {
            System.out.println("hababam sınıfı sınıfta kaldı!! ortalama:"+this.avarage);
            isPass=false;
        }

    }
    void printNote(){
        System.out.println("========");
        System.out.println(name);
        System.out.println(this.c1.name+ " notu:"+this.c1.note+ " sözlü notu:"+this.c1.sozlu);
        System.out.println(this.c2.name+ " notu:"+this.c2.note+ " sözlü notu:"+this.c2.sozlu);
        System.out.println(this.c3.name+ " notu:"+this.c3.note+ " sözlü notu:"+this.c3.sozlu);

    }
}
