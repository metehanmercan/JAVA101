package org.example;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0,tutar,armkg,elmakg,domkg,muzkg,patkg;



        Scanner input=new Scanner(System.in);

        System.out.print("kaç kg armut aldınız ? :");
        armkg=input.nextDouble();


        System.out.print("kaç kg elma aldınız ? :");
        elmakg=input.nextDouble();

        System.out.print("kaç kg domates aldınız ? :");
        domkg= input.nextDouble();

        System.out.print("kaç kg muz aldınız ? :");
        muzkg= input.nextDouble();

        System.out.print("kaç kg patlıcan aldınız ? :");
        patkg= input.nextDouble();

        tutar=(armut*armkg) + (elma*elmakg)+(domates*domkg)+ (muz*muzkg)+(patlican*patkg);

        System.out.println("toplam tutar"+ tutar);



    }
}
