package org.example.java101.patika;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        double r,pi=3.14,alan,aci;

        Scanner input=new Scanner(System.in);
        System.out.print("yarı çapı giriniz:");
        r= input.nextDouble();
        System.out.print("merkez açıyı giriniz:");
        aci= input.nextDouble();

        alan=(pi*r*r*aci)/360;

        System.out.println("alan:"+alan);


    }
}
