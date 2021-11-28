package javacode.src.project1;

import java.util.Scanner;
public class work4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int a=0,b=0,c=0;

        System.out.println("请分别输入三个整数：");
        if(scan.hasNextInt()) a = scan.nextInt();
        if(scan.hasNextInt()) b = scan.nextInt();
        if(scan.hasNextInt()) c = scan.nextInt();
        scan.close();

        if(a<=0||b<=0||c<=0) {
            System.out.println("输入错误，请重新输入");
        }
        else if((a+b)>c&&(a+c)>b&&(b+c)>a){
            System.out.println("三角形周长为：" + (a + b + c));
        }else
            System.out.println("该三个数不能构成三角形");
    }
}

