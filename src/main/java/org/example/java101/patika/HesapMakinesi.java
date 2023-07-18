package org.example.java101.patika;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
       int select;
       double n1,n2;

       Scanner input= new Scanner(System.in);

        System.out.print("bir sayı giriniz:");
        n1=input.nextDouble();
        System.out.print("ikinci bir sayı giriniz:");
        n2=input.nextDouble();

        System.out.println("1-toplama\n2-cıkarma\n3-çarpma\n4-bölme");
        System.out.print("bir işlem seçiniz:");
        select=input.nextInt();
        System.out.println("seçiminiz:" + select);
        if(select==1){
            System.out.println("sonuç:" + (n1+n2));
        }else if (select==2){
            System.out.println("sonuç:" + (n1-n2));
        } else if (select == 3) {
            System.out.println("sonuç :"+ (n1*n2));
        } else if (select==4) {
            if (n2!=0){
                System.out.println("sonuç:"+ (n1/n2));
            } else if (n2==0) {
                System.out.println("bir sayı 0'a bölünemez:");
            }

        } else  {
            System.out.print("yanlış bir seçim yaptınız:");
        }


    }
  }

