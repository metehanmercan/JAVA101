package org.example.java101.patika;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz:");
        int number= input.nextInt();

        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        for (int i=1;i<=number;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

    }
}
