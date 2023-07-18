package org.example.java101.patika;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int eleman,grup,toplam1=1,toplam2=1,sonuç,toplam3=1;

        Scanner input=new Scanner(System.in);
        System.out.println("kümenin eleman sayısı kaç:");
        eleman= input.nextInt();
        System.out.println("kaç elemanlı grup olmalı:");
        grup= input.nextInt();

        for (int i=1;i<=eleman ; i++){
            toplam1=toplam1*i;
        }
        System.out.println(toplam1);

        for (int j=1;j<=grup;j++){
            toplam2=toplam2*j;

        }
        System.out.println(toplam2);

        for (int k=1;k<=(eleman-grup);k++){
            toplam3=toplam3*k;
        }
        System.out.println(toplam3);

        sonuç=toplam1/(toplam2*toplam3);

        System.out.println(eleman+" elemanlı kümenin elemanları ile oluşturulacak " + grup+" elemanlı farklı grupların sayısı:"+ sonuç);
    }

}
