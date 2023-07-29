package org.example.java101.kodlamaio;

public class isPrime {
    public static void main(String[] args) {
        int a=3;
        int result=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                result++;

            }
        }
        if(result==2){
            System.out.println("asal sayıdır: "+a);
        }else {
            System.out.println("asal değildir: "+a);
        }
    }
}
