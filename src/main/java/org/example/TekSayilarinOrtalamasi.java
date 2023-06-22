package org.example;

import java.util.Scanner;

public class TekSayilarinOrtalamasi {
    public static void main(String[] args) {
        int sayi,total=0,avarege,sayiAdeti=0;
        Scanner input=new Scanner(System.in);

        do{
            System.out.print("bir sayı giriniz:");
            sayi=input.nextInt();
            if(sayi%2==1){
                System.out.println(sayi);
                sayiAdeti++;
                total+=sayi;
            }

        }while (sayi>0);

        System.out.println("toplam:" +total );
        avarege=total/sayiAdeti;
        System.out.print("ortalama:" + avarege);
    }
}
