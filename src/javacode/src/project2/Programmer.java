package javacode.src.project2;

public class Programmer extends Employee{
    double extraWorkHours,extraWorkHourspay;

    public Programmer(String name,String sex,String birthday,String address,String ID, double salary, String level, String department,double extraWorkHours,double extraWorkHourspay) {
        super(name,sex,birthday,address,ID, salary, level, department);
        this.extraWorkHourspay=extraWorkHourspay;
        this.extraWorkHours=extraWorkHours;
    }

    @Override
    public double addpay() {
        salary=salary+salary*0.01+extraWorkHours*extraWorkHourspay;
        return salary;
    }
    @Override
    public double pay() {

        return salary;
    }
}
