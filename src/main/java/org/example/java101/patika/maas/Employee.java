package org.example.java101.patika.maas;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,int salary,int workHours,int hireYear){
      this.name=name;
      this.salary=salary;
      this.workHours=workHours;
      this.hireYear=hireYear;
    }
    double tax(){

        if(this.salary>1000){
         return (this.salary * 3) / 100;

        }else {

            return 0;
        }

    }
     double bonus(){

        if(this.workHours>40){

           return (this.workHours-40)*30;

        }else {

            return 0;
        }

    }
    double raiseSalary(){

        if(2021-this.hireYear<10){
            return (this.salary*5)/100;

        }else if (2021-this.hireYear>=10 && 2021-this.hireYear<20){
           return (this.salary*10)/100;

        } else if (2021-this.hireYear>=20) {
           return (this.salary*15)/100;

        }
        return 0;
    }
    void printEmployee(){
        System.out.println("adı: "+this.name);
        System.out.println("maaşı: "+this.salary);
        System.out.println("çalışma saati: "+this.workHours);
        System.out.println("başlangıç yılı: "+this.hireYear);
        System.out.println("vergi: "+tax());
        System.out.println("bonus: "+bonus());;
        System.out.println("maaş artışı: "+raiseSalary());
        System.out.println("vergi ve bonuslar ve maaş artışı ile maaş: "+(this.salary+bonus()-tax()+raiseSalary()));


    }
}
