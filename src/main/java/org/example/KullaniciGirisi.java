package org.example;

import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password;

        Scanner input=new Scanner(System.in);

        System.out.println("kullacı adınızı giriniz:");
        userName= input.nextLine();
        System.out.println("şifrenizi giriniz:");
        password= input.nextLine();

        if (userName.equals("java") && password.equals("java101")){
        System.out.println("giriş yaptınız");
    }else{
            System.out.println("bilgileriniz hatalıdır!!!");
        }
        }
}
