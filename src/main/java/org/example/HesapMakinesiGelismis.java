package org.example;

import java.util.Scanner;

public class HesapMakinesiGelismis {
    static int plus(int a,int b){
        return a+b;
    }
    static int minus(int a,int b){
        return a-b;
    }
    static int times(int a,int b){
        return a*b;
    }
    static int divided(int a,int b){
        return a/b;
    }
    static int power(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int faktoriyel(int a){
        int total=1;
        for(int i=1;i<=a;i++){
         total*=i;
        }
        return total;
    }
    static int mod(int a,int b){
        return a%b;
    }
    static int dikdotgen(int kisa,int uzun){

        return kisa*uzun;
    }




    public static void main(String[] args) {
        String menu="1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n";
        int select;
        int a,b;
        Scanner input=new Scanner(System.in);

        do {
        System.out.print("işlem seçininiz:"+ menu);
        select= input.nextInt();
         if (select==1){
             System.out.print("birinci sayı:");
             a= input.nextInt();
             System.out.print("ikinci sayı:");
             b=input.nextInt();
             System.out.println("sonuç:"+plus(a,b));

        } else if (select==2) {
             System.out.print("birinci sayı:");
             a= input.nextInt();
             System.out.print("ikinci sayı:");
             b=input.nextInt();
             System.out.println("sonuç:"+minus(a,b));

         } else if (select==3) {
             System.out.print("birinci sayı:");
             a= input.nextInt();
             System.out.print("ikinci sayı:");
             b=input.nextInt();
             System.out.println("sonuç:"+times(a,b));

         } else if (select==4) {
             System.out.print("birinci sayı:");
             a= input.nextInt();
             System.out.print("ikinci sayı:");
             b=input.nextInt();
             System.out.println("sonuç:"+divided(a,b));

         } else if (select==5) {
             System.out.print("birinci sayı:");
             a= input.nextInt();
             System.out.print("ikinci sayı:");
             b=input.nextInt();
             System.out.println("sonuç:"+power(a,b));

         } else if (select==6) {
             System.out.print("sayı:");
             a= input.nextInt();
             System.out.println("sonuç:"+faktoriyel(a));

         } else if (select==7) {
             System.out.print("birinci sayı:");
             a= input.nextInt();
             System.out.print("ikinci sayı:");
             b=input.nextInt();
             System.out.println("sonuç:"+mod(a,b));

         } else if (select==8) {
             System.out.print("kısa kenar:");
             a= input.nextInt();
             System.out.print("uzun kenar:");
             b=input.nextInt();
             System.out.println(dikdotgen(a,b));
         } else if (select==0) {
             System.out.println("güle güle:D");
         }
         else{
             System.out.println("geçerli seçim yapınız:");
         }
        }while (select!=0);

    }
}
