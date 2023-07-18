package org.example.java101.patika;

import java.util.Scanner;

public class UceDordeBolunebilme {
    public static void main(String[] args) {

        int sayi, i, toplam = 0, kacAdetOrtakSayiVar = 0, ortalama;

       Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        sayi= input.nextInt();

        for (i=1;i<=sayi;i++){
         if (i%3==0  && i%4==0){
             System.out.println(i);
             kacAdetOrtakSayiVar++;
             toplam+=i;
         }
        }
        ortalama=toplam/kacAdetOrtakSayiVar;
        System.out.println("ortalama:" + ortalama);
    }
}
