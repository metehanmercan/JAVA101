package org.example;

import java.util.Scanner;

public class BasamakSayilariniToplama {
    public static void main(String[] args) {
        int number;
        int basValue;
        int result=0;
        Scanner input=new Scanner(System.in);

        System.out.println("bir sayı giriniz:");
        number= input.nextInt();

        while (number!=0){
            basValue=number%10;

            System.out.println(basValue);
            number/=10;
            result+=basValue;
        }
        System.out.println(result);
    }
}
