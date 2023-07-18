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
    void tax(){
        double vergi;
        if(this.salary>1000){
          vergi=(this.salary * 3) / 100;
            System.out.println("vergi: "+vergi);
        }else {
            vergi=0.0;
            System.out.println("vergi: "+vergi);
        }

    }
    void bonus(){
        int bonuss;
        if(this.workHours>40){
           bonuss=(this.workHours-40)*30;
           System.out.println("bonus artışı: "+bonuss);

        }else {
            bonuss=0;
            System.out.println("bonus artışı: "+bonuss);
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
    void  toStringg(){
        System.out.println("adı: "+this.name);
        System.out.println("maaşı: "+this.salary);
        System.out.println("çalışma saati: "+this.workHours);
        System.out.println("başlangıç yılı: "+this.hireYear);
         tax();
         bonus();
         raiseSalary();
        System.out.println("vergi ve bonuslar ile maaş: "+);

    }
}
