package org.example.java101.kodlamaio;

public class SayiBulma {

    public static void main(String[] args) {

        sayiBulmaca();

    }

    public static void sayiBulmaca() {
        int[] list = new int[]{1, 2, 5, 7, 9, 10};
        int aranacak = 3;
        boolean isHas = false;

        for (int i = 0; i < list.length; i++) {
            if (aranacak == list[i]) {
                isHas = true;
                break;
            }
        }
        if (isHas) {
           mesajVer("sayı mevcuttur: "+aranacak);
        } else {
           mesajVer("sayı mevcut değildir: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}

