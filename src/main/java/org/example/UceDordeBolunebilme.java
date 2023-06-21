package org.example;

import java.util.Scanner;

public class UceDordeBolunebilme {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);

        System.out.println("sayı giriniz");
        a= input.nextInt();

        for (b=1;b<=a;b++){
            if (b%3==0 && b%4==0){
                System.out.println(b);

            }

        }
    }
}
