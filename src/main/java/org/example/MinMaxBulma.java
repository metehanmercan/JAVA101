package org.example;
import java.util.Scanner;
public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.print("Kaç tane sayı gireceksiniz? ");
        int sayiAdedi = input.nextInt();

        int minDeger = Integer.MAX_VALUE;
        int maxDeger = Integer.MIN_VALUE;

        for (int i = 0; i < sayiAdedi; i++) {
            System.out.print("Sayıyı girin: ");
            int sayi = input.nextInt();

            if (sayi < minDeger) {
                minDeger = sayi;
            }

             else if (sayi > maxDeger) {
                maxDeger = sayi;
            }
        }

        System.out.println("En küçük sayı: " + minDeger);
        System.out.println("En büyük sayı: " + maxDeger);
    }
}
