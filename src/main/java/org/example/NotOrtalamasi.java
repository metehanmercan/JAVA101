package org.example;


import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        double mat,fen,biyo;

        Scanner input= new Scanner(System.in);

        System.out.print("matematik notunu gir:");
        mat=input.nextDouble();
        System.out.print("fen notunu gir:");
        fen=input.nextDouble();
        System.out.print("biyoloji notunu gir:");
        biyo=input.nextDouble();

        double ortalama=(mat+fen+biyo)/3;

        boolean kosul = ortalama >=60;
        String durum = kosul ? "geçti" : "kaldı" ;
        System.out.print("ortalama: " + ortalama + "\ndurum:" +  durum);
    }
}