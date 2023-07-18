package org.example.java101.patika;

import java.util.Scanner;

public class UsHesaplama2 {
    static void power(){
        Scanner input=new Scanner(System.in);
        System.out.print("taban değeri:");
        int base= input.nextInt();
        System.out.print("üs değeri:");
        int expo= input.nextInt();
        int result=1;
        for (int i=1;i<=expo;i++){
        result*=base;
        }
        System.out.println("sonuç:"+result);
    }
    public static void main(String[] args) {
       power();
    }
}
