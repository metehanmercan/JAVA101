package org.example.java101.patika;
import  java.util.Scanner;



public class KdvTutari {
    public static void main(String[] args) {
        double tutar, kdv=0.18;


        Scanner input=new Scanner(System.in);
        System.out.println("fiyatı gir:");

        tutar=input.nextDouble();
         double kdvFiyatı=tutar*kdv;
         double kdvliFiyatı=tutar+kdvFiyatı;
        System.out.println("kdv fiyatı:" + kdvFiyatı);
        System.out.println("kdvli fiyat:" +kdvliFiyatı);



    }
}
