package org.example.java101.patika.Diziler;
import java.util.Arrays;
import java.util.List;

public class DizizlerMinMax {
    public static void main(String[] args) {
        int [] list={101,23,53,202,-5,-10};
        /* int min=list[0];
        int max=list[0];

        for(int i : list){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("minumum değer: "+ min);
        System.out.println("max değer: "+ max);

         */
       Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(list[0]);
        System.out.println(list[list.length-1]);
    }
}
