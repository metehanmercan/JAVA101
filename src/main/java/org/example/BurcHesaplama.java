package org.example;
import java.util.Scanner;
public class BurcHesaplama {
    public static void main(String[] args) {
        int month,day;

Scanner input=new Scanner(System.in);

        System.out.println("kaçıncı ayda doğdunuz?");
        month= input.nextInt();
        System.out.println("ayın kaçıncı günü doğdunuz?");
        day= input.nextInt();

        if((month==3)){
            if(day>20){
                System.out.println("burcunuz: KOÇ");
            }else{
                System.out.println("burcunuz: balık");
            }
        } else if (month==4) {
            if(day<21){
                System.out.println("burcunuz: koç");
            }else{
                System.out.println("burcunuz: boğa");
            }
        } else if (month==5) {
            if(day<22){
                System.out.println("burcunuz: boğa");
            }else {
                System.out.println("burcunuz:ikizler");
            }
        } else if (month==6) {
            if(day<23){
                System.out.println("burcunuz: ikizler");
            }else {
                System.out.println("burcunuz:yengeç");
            }
        } else if (month==7) {
            if(day<23){
                System.out.println("burcunuz: yengeç");
            }else{
                System.out.println("burcunuz: aslan");
            }
        } else if (month==8) {
            if(day<23){
                System.out.println("burcunuz: aslan");
            }else {
                System.out.println("burcunuz: başak");
            }
        } else if (month==9) {
            if(day<23){
                System.out.println("burcunuz: başak");
            }else{
                System.out.println("burcunuz: terazi");
            }
        } else if (month==10) {
            if(day<23){
                System.out.println("burcunuz: terazi");
            }else{
                System.out.println("burcunuz: akrep");
            }
        } else if (month==11) {
            if(day<22){
                System.out.println("burcunuz: akrep");
            }else{
                System.out.println("burcunuz: yay");
            }
        } else if (month==12) {
            if(day<22){
                System.out.println("burcunuz: yay");
            }else {
                System.out.println("burcunuz: oğlak");
            }
        } else if (month==1) {
            if(day<22){
                System.out.println("burcunuz:oğlak");
            }else {
                System.out.println("burcunuz: kova");
            }
        } else if (month==2) {
            if(day<20){
                System.out.println("burcunuz:kova");
            }else {
                System.out.println("burcunuz: balık");
            }
        }
    }
}
