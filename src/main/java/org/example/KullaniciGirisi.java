package org.example;

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


        if(username.equals("java") && password.equals("java123")){
            System.out.println("giriş yaptınız");
        } else {
            System.out.println("yanlış giriş yaptınız");
            System.out.println("şifrenizi sıfırlamak ister misiniz?  1-evet 2-hayır"  );
            select=input.nextInt();
              if(select==1){
                  Scanner input1=new Scanner(System.in);
                System.out.println("yeni şifrenizi giriniz:");
                  newpassword=input1.nextLine();

                  if (newpassword.equals("password")){

                      System.out.println("yeni şifreniz eski şifre  olamaz");
                  }else{
                      System.out.println("yeni şifreniz oluşturuldu");
                  }
              } else{
                System.out.println("anasayfaya dönünüz.");
            }

    }
        }
    }