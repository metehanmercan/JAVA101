package org.example;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        int bas= input.nextInt();

        for (int i=bas;i>=0;i--){

            for (int k=1;k<=bas-i;k++) {
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
