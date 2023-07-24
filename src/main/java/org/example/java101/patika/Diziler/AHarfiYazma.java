package org.example.java101.patika.Diziler;

public class AHarfiYazma {
    public static void main(String[] args) {
       String [][] list=new String[6][4];
       for (int i=0;i< list.length;i++){
              for (int j=0;j<list[i].length;j++){
                  if(i==0 || i==2){
                      list[i][j]=" * ";
                  } else if (j==0 || j==3) {
                      if( (j==3 && i==3) || (j==3 && i==4) || (j==3 && i==5)){
                        list[i][j]="   ";
                      }else {
                      list[i][j]=" * ";
                      }
                  }else {
                      list[i][j]="   ";
                  }

              }

       }
       for(String[] row:list){
           for (String col: row){
               System.out.print(col);
           }
           System.out.println();
       }

    }
}
