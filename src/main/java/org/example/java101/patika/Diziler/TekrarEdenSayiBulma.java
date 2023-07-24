package org.example.java101.patika.Diziler;
import java.util.Arrays;
public class TekrarEdenSayiBulma {

    static boolean isFind(int[] arr,int value){
        for(int i:arr ){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list={8,3,7,2,3,2,3,2,9,8,10,21,1,33,9,1,10,12,12};
        int [] duplicate=new int[list.length];
        int startIndex=0;
        for (int i=0;i<list.length;i++){

          for (int j=i+1 ;j< list.length;j++){

                if((list[i]==list[j])){

              if(!isFind(duplicate,list[i])){
                  if(list[i]%2==0){
                  duplicate[startIndex++]=list[i];
                  }
              }
              break;
               }
            }
        }
        System.out.println(Arrays.toString(duplicate));
        }
    }

