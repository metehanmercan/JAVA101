package org.example.java101.patika;

import java.util.Scanner;

public class AsalSayi2 {
    static void asal(){
        Scanner input=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int sayi= input.nextInt();
        int result=0;
        if(sayi>0){
        for(int i=1;i<=sayi;i++){
            if(sayi%i==0){
               result++;
            }
        }
        if(result<=2){
            System.out.println("asaldır");
        }else{
            System.out.println("asal değildir");
          }
        }else {
            System.out.println("pozitif bir sayı giriniz ");
        }
    }
    public static void main(String[] args) {
       do {
           asal();
       }while (true);
    }
}
