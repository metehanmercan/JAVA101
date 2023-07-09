package org.example;

import java.util.Scanner;

public class HesapMakinesiGelismis2 {
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number =0, result = 0, i = 1,sayi;
        System.out.print("kaç adet sayı gireceksiniz:");
        number= scan.nextInt();
        while (i<=number) {
            System.out.print(i + ". sayı :");
            sayi = scan.nextInt();
            i++;
            if (number == 0) {
                break;
            }
            result += sayi;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result =0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int counter , result = 1, i=1 ,sayi;
        System.out.print("kaç değer gireceksiniz?:");
        counter= scan.nextInt();
        if (counter==0){
            System.out.println("değer girilmedi");

        }else {

        while (i<=counter){
            System.out.print(i + ". sayı :");
            sayi = scan.nextInt();


       result*=sayi;
          i++;

         }

        System.out.println("Sonuç : " + result);
        }
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void mod(){
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.print("1. sayı:");
        a= scan.nextInt();
        System.out.println("2. sayı:");
        b= scan.nextInt();
        int mod=a%b;
        System.out.println("sonuç:"+ mod);
    }
    static void dikdortgen(){
        Scanner scan=new Scanner(System.in);
        int kisa,uzun;
        System.out.print("kısa  kenar:");
        kisa= scan.nextInt();
        System.out.print("uzun kenar:");
        uzun= scan.nextInt();
        int cevre=2*(kisa+uzun);
        int alan=kisa*uzun;
        System.out.println("çevre:"+cevre);
        System.out.println("alan:"+ alan);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        do {

            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 0:
                    break;
                case 8:
                    dikdortgen();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);

        System.out.println("güle güle :D");
    }
}


