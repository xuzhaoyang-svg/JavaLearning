package javacode.src.project2;

abstract public class Employee extends Person{
    String ID,level,department;
    double salary;
    public Employee(String name,String sex,String birthday,String address,String ID,double salary,String level,String department){
        super(name,sex,birthday,address);
        this.ID=ID;
        this.salary=salary;
        this.level=level;
        this.department=department;

    }
    public abstract double addpay();
    public abstract double pay();

}
