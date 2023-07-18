package org.example.java101.patika;
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {

        int a,b,c;

        Scanner input=new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("ikinci sayıyı giriniz");
        b= input.nextInt();
        System.out.print("üçüncü sayıyı giriniz:");
        c= input.nextInt();

        if ( (a>b) &&  (a>c)){
            if(b>c){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");
            }
        } else if ((b>a)&& (b>c)) {
            if(a>c){
                System.out.println("b>a>c");
            }else {
                System.out.println("b>c>a");
            }
        } else if ((c>a)&&(c>b)) {
            if(a>b){
                System.out.println("c>a>b");
            }else {
                System.out.println("c>b>a");
            }
        }
    }
}
