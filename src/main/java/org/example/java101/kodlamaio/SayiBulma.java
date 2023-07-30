package org.example.java101.kodlamaio;

public class SayiBulma {
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 5, 7, 9, 10};
        int a = 12;
        boolean isHas = false;

        for (int i = 0; i < list.length; i++) {
            if (a == list[i]) {
                isHas = true;
                break;
            }
        }
        if (isHas){
            System.out.println("sayı listede var");
        }else{
            System.out.println("sayı listede yok");
        }
    }
}

