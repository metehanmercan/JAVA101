package org.example.java101.patika;

import javax.swing.*;
import java.util.Scanner;
public class KullaniciGirisi{
    public static void main(String[] args) {


        String username,password,newpassword;
        int select;

        Scanner input=new Scanner(System.in);


        System.out.println("kullnıcı adınız:");
        username=input.nextLine();
        System.out.println("şifreniz:");
        password=input.nextLine();

        if(username.equals("ismail")&&password.equals("teğmen")){
            System.out.println("giriş yaptınız");
        } else {
            System.out.println("yanlış giriş yaptınız");
            System.out.println("şifrenizi sıfırlamak ister misiniz?  1-evet 2-hayır"  );
            select=input.nextInt();
            input.nextLine();
              if(select==1){

                System.out.println("yeni şifrenizi giriniz:");
                  newpassword=input.nextLine();

                  if (newpassword.equals("teğmen")){

                      System.out.println("yeni şifreniz eski şifre  olamaz");
                  }else{
                      System.out.println("şifreniz oluşturuldu");
                      if (newpassword.equals("mete123")){
                          System.out.println("hesaba giriş yapıldı");

                      }else {
                          System.out.println("yeni şifreyle tekrar giriniz");
                          newpassword=input.nextLine();

                          if(newpassword.equals(newpassword)){
                          System.out.println("kontrollü giriş yapıldı");
                  }
                      }
                  }
              } else{
                System.out.println("anasayfaya dönünüz.");
            }

    }
        }
    }