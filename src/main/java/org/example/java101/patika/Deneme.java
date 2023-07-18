package org.example.java101.patika;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        int mat,fizik,tukce,kimya,muzik;
        Scanner input=new Scanner(System.in);
        int dersSayisi=0,toplamnot=0;

        System.out.println("matematik notunu gir:");
        mat= input.nextInt();
        if((mat>=0) && (mat<=100)){
            toplamnot+=mat;
            dersSayisi++;
        }

        System.out.println("fizik notunu gir:");
        fizik= input.nextInt();
        if((fizik>=0) && (fizik<=100)){
            toplamnot+=fizik;
            dersSayisi++;
        }

        System.out.println("türkçe notunu gir:");
        tukce= input.nextInt();
        if((tukce>=0) && (tukce<=100)){
            toplamnot+=tukce;
            dersSayisi++;
        }

        System.out.println("kimya notunu gir:");
        kimya= input.nextInt();
        if((kimya>=0) && (kimya<=100)){
            toplamnot+=kimya;
            dersSayisi++;
        }

        System.out.println("müzik notunu gir:");
        muzik= input.nextInt();
        if((muzik>=0) && (muzik<=100)){
            toplamnot+=muzik;
            dersSayisi++;
        }

        double avarege=(double) toplamnot/dersSayisi;
        System.out.println("ortalamanız:" + avarege);

        if (avarege>55){
            System.out.println("geçtiniz.");
        }else{
            System.out.println("kaldınız");
        }
        input.close();
    }
}
