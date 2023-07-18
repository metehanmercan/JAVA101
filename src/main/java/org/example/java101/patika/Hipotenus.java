package org.example.java101.patika;
import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {

        double a,b,c;

        Scanner input=new Scanner(System.in);

        System.out.print("a dik kenarını giriniz:");
        a=input.nextDouble();
        System.out.print("b dik kenarını giriniz:" );
        b= input.nextDouble();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("hiponetüz uzunluğu:"+ c);


    }
}
