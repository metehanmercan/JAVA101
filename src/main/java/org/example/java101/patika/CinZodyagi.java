package org.example.java101.patika;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("doğum yılınız nedir?:");
        year = input.nextInt();

        if (year % 12 == 0) {
            System.out.println("çin zodyağı burucunuz: maymun");
        } else if (year % 12 == 1) {
            System.out.println("çin zodyağı burucunuz: horoz");
        } else if (year % 12 == 2) {
            System.out.println("çin zodyağı burucunuz: köpek");
        } else if (year % 12 == 3) {
            System.out.println("çin zodyağı burucunuz: domuz");
        } else if (year % 12 == 4) {
            System.out.println("çin zodyağı burucunuz: fare");
        } else if (year % 12 == 5) {
            System.out.println("çin zodyağı burucunuz: öküz");
        } else if (year % 12 == 6) {
            System.out.println("çin zodyağı burucunuz: kaplan");
        } else if (year % 12 == 7) {
            System.out.println("çin zodyağı burucunuz: tavşan");
        } else if (year % 12 == 8) {
            System.out.println("çin zodyağı burucunuz: ejderha");
        } else if (year % 12 == 9) {
            System.out.println("çin zodyağı burucunuz: yılan");
        } else if (year % 12 == 10) {
            System.out.println("çin zodyağı burucunuz: at");
        } else if (year % 12 == 11) {
            System.out.println("çin zodyağı burucunuz: koyun");
        }
    }
}
