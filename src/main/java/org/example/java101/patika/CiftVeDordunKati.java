package org.example.java101.patika;

import java.util.Scanner;

public class CiftVeDordunKati {
    public static void main(String[] args) {
        int sayi,total=0;
        Scanner input=new Scanner(System.in);

        do {
            System.out.print("sayı giriniz:");
            sayi= input.nextInt();
            if (sayi%2==0 && sayi%4==0){
                total+=sayi;

            }
        }while (sayi%2==0);

        System.out.print("çift ve 4'e bölünebilenlerin toplamı:"+total);
    }
}
