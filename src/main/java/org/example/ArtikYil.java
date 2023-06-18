package org.example;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;

        Scanner input=new Scanner(System.in);
        System.out.print("bir yıl giriniz:");
        year= input.nextInt();
        if(year%400==0){
            System.out.println("artık yıl:" +year);
        } else if((year%4==0) && (year%100 >0)){
            System.out.println("artık yıl:" +year);
        }else{
            System.out.println("artıl yıl değil:"+ year);
        }
    }
}
