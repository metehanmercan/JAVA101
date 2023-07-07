package org.example;

import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
          temp/=10;
        }
        if(number==reverseNumber) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("sayıyı giriniz:");
        int number=input.nextInt();
        System.out.println(isPalindrom(number));
    }
}
