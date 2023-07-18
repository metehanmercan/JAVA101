package org.example.java101.patika;

 class Car {
     // nitelikler
     String type;
     String model;
     String color;
     int speed;
     int speedLimit =180;
     Car(String model,int speed){
         this.model="audiii";

         this.speed=speed;
         System.out.println(model);
     }
     void increaseSpeed(int increment){
         if ((speed+increment)<= speedLimit){
             speed+=increment;
         }

     }
     void decreaseSpeed(int decrease){
         if(speed>0){
             speed-=decrease;
         }
     }
     void printSpeed(){
         System.out.println( model +"/hızınız:"+ speed);
     }
     void info(){
         System.out.println("model :"+ this.model);
     }
}
