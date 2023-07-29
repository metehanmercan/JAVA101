package org.example.java101.kodlamaio;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 5;

        int[] list = {a, b, c};
        int max = a;

        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        System.out.println("max değer: " + max);


        /* if(a>b && a>c){
         if(b>c){
          System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");

            }
        }

        else if (b>a && b>c){
           if(a>c){
               System.out.println("b>a>c");
           }else {
               System.out.println("b>c>a");
           }
        }

        else{
           if(b>a){
               System.out.println("c>b>a");
           }else {
               System.out.println("c>a>b");

           }
        }

        */
    }
}
