package org.example;

import java.util.Scanner;

public class AtmProjesi{
    public static void main(String[] args) {
        String username,password;
        Scanner input=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;

        while (right>0){
            System.out.print("kullanıcı adınız:");
            username=input.nextLine();
            System.out.print("şifreniz:");
            password=input.nextLine();
            if(username.equals("metehan01") && password.equals("mete321.")){
                System.out.println("Bankamıza hoş geldiniz.");
               do {

                   System.out.println("1-para yatırma\n" + "2-para çekme\n" + "3-bakiye sorgulama\n"+"4-çıkış yap");
                   System.out.print("lütfen yapmak istediğiniz işlemi seçiniz:");
                   select= input.nextInt();
                   if(select==1){
                       System.out.println("yatırmak istediğiniz tutar:");
                       int price= input.nextInt();
                       balance+=price;
                       System.out.println(balance);
                   } else if (select==2) {
                       System.out.println("cekmek istediğiniz tutarı giriniz");
                     int  price=input.nextInt();
                     balance-=price;
                     if(balance<0){
                         System.out.println("bakiyeniz yetersizdir");
                     }else{
                         System.out.println("paranız veriliyor... kalan bakiye:"+ balance);
                       }
                   } else if (select==3) {
                       System.out.println("bakiyeniz:"+ balance);
                   }

               }while (select!=4);
                System.out.println("görüşmek üzere.");
               break;
            } else {
                System.out.println("hatalı kullanıcı adı veya şifre. Tekrar deneyiniz");
                System.out.println("kalan hakkınız:" + --right);
                if (right==0) {
                    System.out.println("hesabınız bloke oldu, Banka ile iletişime geçiniz.");
                }
            }
        }
    }
}