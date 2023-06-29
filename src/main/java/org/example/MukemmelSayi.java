package org.example;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int number= input.nextInt();
        int total=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                System.out.println(i);
                total+=i;
            }

        }
        System.out.println("pozitif bölenlerinin toplamı:"+total);
        if(total==number){
            System.out.println(number + " mükemmel sayıdır");
        }else{
            System.out.println(number+ " mükemmel sayı değildir");
        }
    }
}
