package org.example;

   public class IfElse {

      public static void main(String[] args) {
        int a=10,b=10;
        boolean compare= (a==b);
        // String str=compare ? "eşittir" :"eşit değildir";
        // System.out.println(str);

         if (compare){
             a=50;
             System.out.println("a sayısı : " + a);
             System.out.println("eşittir");
         }  else {
             System.out.println("eşit değildir");
         }
         }
      }