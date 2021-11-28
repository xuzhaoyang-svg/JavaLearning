package javacode.src.project1;

class boxstyle{
    private double height;
    private double width;
    private double depth;
    boxstyle(double H,double W,double D){
        height=H;
        width=W;
        depth=D;
    }
    boxstyle(){
        height=10;
        width=9;
        depth=8;
    }
    void setHeight(double h){
        height=h;
    }
    void setWidth(double w){
        width=w;
    }
    void setDepth(double d){
        depth=d;
    }
    double getHeight(){
        return this.height;
    }
    double getWidth(){
        return this.width;
    }
    double getDepth(){
        return this.depth;
    }
    void full(){
        if (this.depth!=0&&this.height!=0&&this.width!=0){
            System.out.println("容积为"+this.height*this.width*this.depth);
        }
        else{
            System.out.println("Box不存在！");
        }

    }
    public String toString(){
        return "长度："+this.height+"\n宽度："+this.width+"\n深度："+this.depth;
    }

}
public class Box {
    public static void main(String test[]){
        boxstyle B;
        B=new boxstyle();
        System.out.println("初始化\n"+B);
        B.full();
        B.setHeight(8);
        B.setWidth(9);
        B.setDepth(10);
        System.out.println("\n自定义赋值\n"+B);
        B.full();
        B=new boxstyle(0,0,0);
        System.out.println("\n错误提示\n"+B);
        B.full();
    }

}
