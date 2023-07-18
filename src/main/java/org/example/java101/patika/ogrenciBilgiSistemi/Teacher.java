package org.example.java101.patika.ogrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpNO;
    String branch;
    Teacher(String name,String branch,String mpNO){
        this.name=name;
        this.branch=branch;
        this.mpNO=mpNO;
    }
    void print(){
        System.out.println("adı:"+ this.name);
        System.out.println("telefonu:"+ this.mpNO);
        System.out.println("bölümü:"+ this.branch);
    }

}
