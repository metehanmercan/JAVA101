package org.example.java101.patika;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int a,b,total=1;
        Scanner input=new Scanner(System.in);

        System.out.println("üssü alınacak sayı:");
        a= input.nextInt();
        System.out.println("sayının üssü:");
        b= input.nextInt();

        for (int i=1;i<=b;i++) {
            total *= a;
        }
        System.out.println("sonuç:"+ total);
    }
}
