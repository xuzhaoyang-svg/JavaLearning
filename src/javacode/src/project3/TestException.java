package javacode.src.project3;
import java.util.Scanner;
public class TestException {
    public static void main(String[] args) {
        int integer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");

        try {

            integer = scanner.nextInt();
            if(integer < 0) {
                throw new OutOfRangeException("您输入的数字为负数！输入有误！");
            } else if(integer > 100) {
                throw new OutOfRangeException("您输入的数字大于100！输入有误！");
            } else {
                System.out.println("你输入的数字为："+integer);
            }
        }
        catch (OutOfRangeException e1){
            System.out.println(e1.getMessage());
        }

    }

}
