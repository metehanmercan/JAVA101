package org.example.java101.patika;

public class RecursiveFibonacci {

    static int fibonacci(int x){
        if (x==1 || x==2){
return 1;
        }
            return fibonacci(x-1)+fibonacci(x-2);
        }


    public static void main(String[] args){
        System.out.println(fibonacci(7));
    }
}
