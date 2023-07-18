package org.example.java101.patika;

public class ElseIf {
    public static void main(String[] args) {
        int a=10,b=20,c=1;
        if(  (a<b)&& (a<c) ){
            System.out.println("a en küçük sayıdır");
        }
         else if ( (b<a) && (b<c)){
            System.out.println("b en küçük sayıdır");
        }
         else if( (c<a) && (c<b)){
            System.out.println("c en küçük sayıdır");
        }
    }
}
