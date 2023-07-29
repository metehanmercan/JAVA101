package org.example.java101.kodlamaio;

import java.util.Locale;

public class Stringg {
    public static void main(String[] args) {
        String mesaj = "bugün hava cok güzel.";

        System.out.println(mesaj);
        System.out.println("eleman sayısı: " + mesaj.length());
        System.out.println("5. eleman: " + mesaj.charAt(6));
        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));

        char[] karakterler = new char[10];
        mesaj.getChars(0, 5, karakterler, 2);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("gü"));
        System.out.println(mesaj.lastIndexOf("gü"));

        String newMessage = mesaj.replace(" ", "-");
        System.out.println(newMessage);

        System.out.println(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);

        }

        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());


        String sev="   asdadfd   ";
        System.out.println(sev.trim());

    }

}

