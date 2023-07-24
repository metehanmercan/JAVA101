package org.example.java101.patika.Diziler;

public class HelperArray {
    static void print(int[] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }

    static int[] fill(int[] arr,int a,int b,int c){
        for (int i=0;i<arr.length;i++){
            if(i>=a && i<b){
                arr[i]=c;
            }else {
                arr[i]=i+1;
            }
            System.out.print(arr[i]+",  ");
        }
        return  arr;
    }
    static boolean equals(int[] l1,int [] l2){
        if(l1.length!= l2.length){
            return false;
        }else {
            for (int i=0;i<l1.length;i++){
               if(l1[i]!=l2[i]){
                   return false;
               }
            }
        }
        return true;
    }
}
