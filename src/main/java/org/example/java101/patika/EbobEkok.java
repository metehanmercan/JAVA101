package org.example.java101.patika;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısı:");
        int n1= input.nextInt();
        System.out.print("n2 sayısı:");
        int n2= input.nextInt();
        int ebob=1;

        if(n1<n2){
            for(int i=n1;i>=1;i--){
               if (n1%i==0 && n2%i==0){
                   ebob=i;
                   break;
               }
            }
            System.out.println(ebob);
        } else if (n2<n1) {
            for(int i=n2;i>=1;i--){
                if(n2%i==0 && n1%i==0){
                    ebob=i;
                    break;
                }
            }
            System.out.println(ebob);
        }
    }
}







/*
        if(n1<n2){
            for (int i=1 ;i<=n1;i++){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
            }
            System.out.println(ebob);
        }else if (n2<n1){
            for (int i=1;i<=n2;i++){
                if(n2%i==0 && (n1%i)==0){
                    ebob=i;
                }
            }
            System.out.println(ebob);
        }else{
            System.out.println(n1);
        }

 */

