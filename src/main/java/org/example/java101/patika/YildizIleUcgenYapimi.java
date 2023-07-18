package org.example.java101.patika;

import java.util.Scanner;

public class YildizIleUcgenYapimi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("basamak sayıyını giriniz: ");
        int number= input.nextInt();

        for (int i=1;i<=number;i++){
            for (int j=1;j<=(number-i);j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
