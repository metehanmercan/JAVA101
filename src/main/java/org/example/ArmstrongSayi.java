package org.example;

import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("sayıyı giriniz:");
        int sayi= input.nextInt();

        int basSayisi=0;
        int tempsayi=sayi;
        int basamakDegeri;
        int us=1;
        int result=0;

        while (tempsayi!=0){
            tempsayi/=10;
            basSayisi++;
        }
        tempsayi=sayi;
       while (tempsayi!=0){
          basamakDegeri=tempsayi%10;
          us=1;
           for (int i=1;i<=basSayisi;i++){
               us*=basamakDegeri;

           }result+=us;
           tempsayi/=10;
       }
        System.out.println(result);

       if(result==sayi){
           System.out.println("armstrong sayıdır");
       }else{
           System.out.println("armstrong sayı değil");
       }
    }
}
