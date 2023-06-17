package org.example;

import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        int heat;

        Scanner input=new Scanner(System.in);

        System.out.println("hava sıcaklığını giriniz:");
        heat= input.nextInt();

        if(heat<=5) {
            System.out.println("kayak yapabilirsiniz.");
        } else if (heat<10) {
            System.out.println("sinemaya gidebilirsiniz");

        } else if (heat<=15 && heat>=10) {
            System.out.println("pikniğe ya da sinemaya gidebilirsiniz.");
        } else if (heat>15 && heat<=25) {
            System.out.println("pikniğe gidebilirsin.");
        }else{
            System.out.println("yüzebilirsin .");
        }

    }
}
