package org.example.java101.patika;

public class ForDongusu {
    public static void main(String[] args) {


        for (int i=0; i<10;i++){
            if (i==5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("------");

        int i=1;
        while (i<=10){
            i++;
            if(i%2==0){
                continue;
            }
            System.out.println(i);

        }
    }
}
