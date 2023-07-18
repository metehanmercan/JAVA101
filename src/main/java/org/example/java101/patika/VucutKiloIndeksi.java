package org.example.java101.patika;

import java.util.Scanner;

public class VucutKiloIndeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner input=new Scanner(System.in);

        System.out.print("boyunuzu giriniz (metre cinsinden):");
        boy=input.nextDouble();

        System.out.print("kilonuzu giriniz:");
        kilo=input.nextDouble();

        indeks=kilo/(boy*boy);
        boolean kosul=indeks>20;
        String durum =kosul ? "diyet yapmalısın!!!" : "fitsin";
        System.out.println(durum);

        System.out.print("vücut kilo indeksiniz:" + indeks);

    }

}
