package org.example;

import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();
        for (int i = 1, j = 1; i <= n && j <= n ; i *=4, j *=5) {
            System.out.println( i + "   " + j);
        }
    }
}
