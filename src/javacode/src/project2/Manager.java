package javacode.src.project2;

public class Manager extends Employee{
    double bonus;
    public Manager(String name,String sex,String birthday,String address,String ID, double salary, String level, String department,double bonus) {
        super(name,sex,birthday,address,ID, salary, level, department);
        this.bonus=bonus;
    }

    @Override
    public double addpay() {
        salary=salary+salary*0.1+bonus;
        bonus=0;
        return salary;
    }

    @Override
    public double pay() {
        return salary;
    }
}
