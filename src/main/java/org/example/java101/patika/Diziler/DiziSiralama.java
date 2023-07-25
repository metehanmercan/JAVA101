package org.example.java101.patika.Diziler;
import java.util.Arrays;
import java.util.Scanner;
public class DiziSiralama {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("eleman sayısı?: ");
       int n=input.nextInt();
        int[] list=new int[n];

        for(int i=0;i<list.length;i++){
            System.out.print(i+1 +". elemanı: ");
           int sayi=input.nextInt();
           list[i]=sayi;

        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }

}
