package org.example;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int km,age,select;
        double tl=0.10,toplamTl,yasindirimliFiyat,sonFiyat;

        Scanner input=new Scanner(System.in);

        System.out.print("km giriniz:");
        km= input.nextInt();
        System.out.print("yaşınızı giriniz: ");
        age= input.nextInt();
        System.out.print("yolculuk tipi seciniz: 1-tek yön, 2-gidiş dönüş:");
        select= input.nextInt();

        toplamTl=km*tl;

        if((age<12) && (age>0) && (km>0)){
           if(select==1){
              yasindirimliFiyat=toplamTl-(toplamTl*0.50);
               System.out.print("tutarınız:" + yasindirimliFiyat);
           }else if (select==2){
               yasindirimliFiyat=toplamTl-(toplamTl*0.50);
              sonFiyat=(yasindirimliFiyat)-(yasindirimliFiyat*0.20);
               System.out.print("tutar:" + sonFiyat);
           }else {
               System.out.println("yanlış veri girdiniz:");
           }
        } else if ((age<24) && (age>11) &&(km>0)) {
            if (select==1){
                yasindirimliFiyat=toplamTl-(toplamTl*0.10);
            }else if(select==2) {
                yasindirimliFiyat=toplamTl-(toplamTl*0.10);
                sonFiyat=(yasindirimliFiyat)-(yasindirimliFiyat*0.20);
                System.out.print("tutar:" + sonFiyat);
            }else {
                System.out.println("yanlış veri girdiniz:");
            }
        } else if ((age>64) && (km>0) ){
            if(select==1){
                yasindirimliFiyat=toplamTl-(toplamTl*0.30);
                System.out.print("tutar:"+yasindirimliFiyat);
            }else if (select==2){
                yasindirimliFiyat=toplamTl-(toplamTl*0.30);
                sonFiyat=(yasindirimliFiyat)-(yasindirimliFiyat*0.20);
            }else {
                System.out.println("yanlış veri girdiniz:");
            }
        } else if ((age>23) && (age<65) && (km>0)) {
            if(select==1){
                System.out.println("tutarınız:" +toplamTl );
            }else if(select==2){
                sonFiyat=toplamTl-(toplamTl*0.20);
            }else {
                System.out.println("yanlış veri girdiniz:");
            }
        }else if((age<0) || (km<0)){
            System.out.print("hatalı veri girişi");
        }
    }
}
