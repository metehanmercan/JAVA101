package org.example.java101.patika;

import java.util.Scanner;

public class HesapMakinesii {
    public static void main(String[] args) {
        int select;
        double n1,n2;

        Scanner input=new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz:");
        n1= input.nextDouble();
        System.out.print("ikinci sayıyı giriniz:");
        n2= input.nextDouble();

        System.out.println("1-toplama\n2-cıkarma\n3-çarpma\n4-bölme");
        System.out.println("bir işlem seçiniz");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if (n2!=0){

                    System.out.println(n1/n2);
                } else  {
                    System.out.println("bir sayı sıfıra bölünemez");

                }
                break;
            default:
                System.out.println("yanlış seçim yaptınız!!!");
        }

    }
}
