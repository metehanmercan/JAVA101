package org.example;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        double r,pi=3.14,alan,cevre;

        Scanner input=new Scanner(System.in);
        System.out.print("yarı çapı giriniz:");
        r= input.nextDouble();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("alan:" + alan);
        System.out.println("çevre:" + cevre);

    }
}
