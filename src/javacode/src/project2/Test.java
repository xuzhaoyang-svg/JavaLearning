package javacode.src.project2;

public class Test {
    public static void main(String[] args) {
        Employee a = new Programmer("张三", "男", "2000，1，1", "西安市", "1", 10000,"1","工程师",1,100);
        Employee b = new Manager("李四", "男", "1990，1，1", "北京", "01",100000,"A","经理",100000);


        System.out.println("ID为" + a.ID +"姓名为"+a.name+ "工资是" + a.pay());
        System.out.println("ID为" + a.ID +"姓名为"+a.name+ "涨工资后的工资是" + a.addpay());

        System.out.println("ID为" + b.ID+"姓名为"+b.name + "工资是" + b.pay());
        System.out.println("ID为" + b.ID +"姓名为"+b.name+ "涨工资后的工资是" + b.addpay());
    }

}
