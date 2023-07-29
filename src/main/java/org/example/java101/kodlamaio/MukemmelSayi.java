package org.example.java101.kodlamaio;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number = 284;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println("bölenlerin toplamı: " + sum);
        if (sum == number) {
            System.out.println("mükemmel sayıdır.");
        } else {
            System.out.println("mükemmel sayı değildir.");
        }
    }
}
