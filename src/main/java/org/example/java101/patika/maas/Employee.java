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
    void raiseSalary(){
        double raiseSalaryy;
        if(2021-this.hireYear<10){
            raiseSalaryy=(this.salary*5)/100;
            System.out.println("maaş artışı: "+raiseSalaryy);
        }else if (2021-this.hireYear>=10 && 2021-this.hireYear<20){
            raiseSalaryy=(this.salary*10)/100;
            System.out.println("maaş artışı: "+raiseSalaryy);
        } else if (2021-this.hireYear>=20) {
            raiseSalaryy=(this.salary*15)/100;
            System.out.println("maaş artışı: "+raiseSalaryy);
        }
    }
    void printEmployee(){
        System.out.println("adı: "+this.name);
        System.out.println("maaşı: "+this.salary);
        System.out.println("çalışma saati: "+this.workHours);
        System.out.println("başlangıç yılı: "+this.hireYear);
         tax();
         bonus();
         raiseSalary();
        System.out.println("vergi ve bonuslar ile maaş: ");

    }
}
