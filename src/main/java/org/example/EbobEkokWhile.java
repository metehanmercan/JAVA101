package org.example;

import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("n1 sayısı:");
        int n1= input.nextInt();
        System.out.println("n2 sayısı:");
        int n2= input.nextInt();

        int i=1,ebob=1;
        // ebob buluyoruz
        if(n1<=n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;

                }
                i++;
            }
            System.out.println("ebob değeri:"+ebob);
        }
        else {
            while (i<=n2){
                if(n1 % i == 0 && n2 % i == 0){
                    ebob=i;
                }
                i++;
            }
            System.out.println("ebob değeri:"+ebob);
        }
        //ekok buluyoruz
        int ekok=1;
        while (i<=n1*n2){
            if(i%n1==0 && i%n2==0){
                ekok=i;
                break;
            }
            i++;
        }
        System.out.println("ekok değeri:"+ekok);
    }
}
