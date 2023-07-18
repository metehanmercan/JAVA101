package org.example.java101.patika;

import java.util.Scanner;

public class WhileDongusu{
    public static void main(String[] args) {
        int password;
        boolean isPasswordSucces=false;
        Scanner input=new Scanner(System.in);



        while (!isPasswordSucces){
            System.out.print("şifrenizi giriniz:");
            password=input.nextInt();

            if (password==123){
                System.out.println("giriş yaptınız");
                isPasswordSucces=true;
            }else{
                System.out.println("yanlış giriş yaptınız");
            }
        }
    }
}
