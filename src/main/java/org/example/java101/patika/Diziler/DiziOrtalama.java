package org.example.java101.patika.Diziler;

public class DiziOrtalama {
    public static void main(String[] args) {
        int[] list={1,2,3,4,5};
        double sum=0;
        double avarage=0.0;
        for(int i=0;i<list.length;i++){
            sum +=list[i];
        }
        avarage=sum/list.length;
        System.out.println(avarage );
    }
}
