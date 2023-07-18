package org.example.java101.patika.boks;

public class Match {
    Fighter f1;
    Fighter f2;
    int minweight;
    int maxweight;
    Match(Fighter f1,Fighter f2,int minweight,int maxweight){
        this.f1=f1;
        this.f2=f2;
        this.minweight=minweight;
        this.maxweight=maxweight;
    }
    void run(){
        if(isCheck()){
           while (this.f1.health>0&& this.f2.health>0){
               System.out.println("===yeni round=== ");
          this.f2.health=this.f1.hit(f2);
            if (isWin()){
                break;
            }

          this.f1.health=this.f2.hit(f1);

             if (isWin()){
                 break;
             }
               System.out.println(this.f1.name+" kalan sağlık "+ this.f1.health);
               System.out.println(this.f2.name+" kalan sağlık "+ this.f2.health);
           }
        }else {
            System.out.println("sikletler uyuşmuyor");
        }
    }
    boolean isCheck(){
   return ((this.f1.weight>=this.minweight&& this.f1.weight<=this.maxweight)&&(this.f2.weight>=this.minweight&&this.f2.weight<=this.maxweight));

    }
    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name+ " kazandı");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(this.f1.name+ " kazandı");
            return true;
        }
        return false;
    }
}
