package org.example.java101.patika;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();

       for(int i=2;i<=n;i++){
           int total=0;
           for(int k=1;k<=i;k++){
               if(i%k==0){
                   total++;
               }
           }
           if(total<=2){
               System.out.println(i);
           }
       }
    }
}