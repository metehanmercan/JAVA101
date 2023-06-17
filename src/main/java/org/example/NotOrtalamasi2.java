package org.example;

import java.util.Scanner;

public class NotOrtalamasi2 {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner input=new Scanner(System.in);

        System.out.println("matematik notunuz?:");
        mat= input.nextInt();
        System.out.println("fizik notunuz?:");
        fizik= input.nextInt();
        System.out.println("türkçe notunuz?:");
        turkce= input.nextInt();
        System.out.println("kimya notunuz?:");
        kimya= input.nextInt();
        System.out.println("müzik notunuz?:");
        muzik= input.nextInt();

        double avarege=(mat+fizik+turkce+kimya+muzik)/5;

      if(mat>100 || mat<0){
            avarege=(fizik+turkce+kimya+muzik)/4;
          System.out.println(avarege);
          if (avarege<55){
              System.out.println("sınıfta kaldınız");
          }else {
              System.out.println("sınıfı geçtiniz");
          }
      } else if (fizik>100 || fizik<0) {
          avarege=(mat+turkce+kimya+muzik)/4;
          System.out.println(avarege);
          if(avarege<55){
              System.out.println("sınıfta kaldınız");
          }else{
              System.out.println("sınıfı geçtiniz");
          }
      }else  if (turkce>100 || turkce<0) {
          avarege=(mat+fizik+kimya+muzik)/4;
          System.out.println(avarege);
          if(avarege<55){
              System.out.println("sınıfta kaldınız");
          }else{
              System.out.println("sınıfı geçtiniz");
          }
      } else if (kimya>100 || kimya<0) {
          avarege=(mat+fizik+turkce+muzik)/4;
          System.out.println(avarege);
          if(avarege<55){
              System.out.println("sınıfta kaldınız");
          }else{
              System.out.println("sınıfı geçtiniz");
          }
      } else if (muzik>100 || muzik<0) {
          avarege=(mat+fizik+turkce+kimya)/4;
          System.out.println(avarege);
          if (avarege<55) {
              System.out.println("sınıfta kaldınız");
          }else {
              System.out.println("sınıfı geçtiniz");
          }
      }

    }
}
