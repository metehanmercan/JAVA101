package org.example.java101.kodlamaio;

public class While {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("bitti");

        int j = 12;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
        System.out.println("do while bitti");

    }
}
