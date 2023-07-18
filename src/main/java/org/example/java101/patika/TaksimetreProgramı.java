package org.example.java101.patika;

import java.util.Scanner;

public class TaksimetreProgramı {
    public static void main(String[] args) {
        double km, perKm=2.2, startPrice=10,total;

        Scanner input=new Scanner(System.in);

        System.out.print("km giriniz:");
        km= input.nextDouble();

        total=(km*perKm)+startPrice;
        total= (total < 20) ? 20 : total;
        System.out.println("toplam tutar:" + total);

    }
}
