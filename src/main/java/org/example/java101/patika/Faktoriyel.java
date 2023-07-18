package org.example.java101.patika;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        int n,toplam=1,i=1;
        Scanner input=new Scanner(System.in);
        System.out.println("faktöriyel sayısını giriniz:");
        n= input.nextInt();

        for (i=1;i<=n;i++){
            toplam= toplam*i;
        }
        System.out.println(toplam);
    }
}
