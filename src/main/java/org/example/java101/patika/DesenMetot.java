package org.example.java101.patika;

import java.util.Scanner;

public class DesenMetot {
    static void metot(int n) {

        if (n<=0){
            System.out.println("sonuç" +n);
       return;
        }else{
            System.out.println("cıkarma işlemi:"+ n);
            metot(n-5);
            System.out.println("tekrar sayı eklendi:"+n);
        }
    }

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= input.nextInt();
metot(sayi);
    }
}
