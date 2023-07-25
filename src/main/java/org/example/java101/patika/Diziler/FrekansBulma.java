package org.example.java101.patika.Diziler;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FrekansBulma {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("elaman sayısı?: ");
        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            System.out.println(i + 1 + ". eleman");
            int sayi = input.nextInt();
            list[i] = sayi;
        }

        System.out.println(Arrays.toString(list));



        for (int j = 0; j < list.length; j++) {
            int plus = 1;
            for (int k = j+1; k < list.length; k++) {

                if (list[j] == list[k]) {
                    plus++;
                }
            }
            if(plus>1){
                System.out.println(list[j] + " sayısının frekansı: " + plus);

            }
        }
    }
}
