package javacode.src;

public class Vehicle {
    String color;
    double speed,weight,MaxSpeed;

    public Vehicle(double speed,String color,double weight,double MaxSpeed){
        this.speed=speed;
        this.color=color;
        this.weight=weight;
        this.MaxSpeed=MaxSpeed;

    }
    public void start(){
        if (this.speed>0){
        System.out.println("已启动");
        }
        else {
            System.out.println("启动成功");
        }
    }
    public void startup(){
        if (this.speed<=this.MaxSpeed)
        System.out.println("正在加速");
        else {
            System.out.println("已达到最大速度："+this.MaxSpeed);
        }
    }
    public void startdown(){
        if (this.speed>0){
        System.out.println("正在减速");
        }
        else {
            System.out.println("速度以为0km");
        }
    }
    public void stop(){
        System.out.println("刹车");
    }

}
