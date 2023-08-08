package org.example.java101.kodlamaio.methods;

public class Method {

    public static void ekle() {
        System.out.println("eklendi");

    }

    public static void delete() {
        System.out.println("silindi");
    }

    public static void guncelle() {
        System.out.println("güncellendi");

    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String city() {
        return "adana";

    }

    public static int topla2(int... sayilar) {
        int result = 0;
        for (int sayi : sayilar) {
            result += sayi;
        }
        return result;
    }


    public static void main(String[] args) {
        String mesaj = "bugün hava cok güzel.";

        String newmesaj = city();
        System.out.println(newmesaj);

        int sayi = topla(2, 5);
        System.out.println(sayi);

        topla2(1,2,3,4);
        System.out.println(topla2(1,2,3,4));
    }
}
