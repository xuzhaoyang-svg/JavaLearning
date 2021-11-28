package javacode.src;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = -1, y1 = -1, x2 = -1, y2 = -1;

        while (true) {
            System.out.println("请分别输入两个点横纵整数坐标：");
            System.out.println("x1:");
            if (scan.hasNextInt()) x1 = scan.nextInt();
            System.out.println("y1:");
            if (scan.hasNextInt()) y1 = scan.nextInt();
            System.out.println("x2:");
            if (scan.hasNextInt()) x2 = scan.nextInt();
            System.out.println("y2:");
            if (scan.hasNextInt()) y2 = scan.nextInt();

            if ((x1 >= 0 && x1 < 100) && (y1 >= 0 && y1 < 100) && (x1 >= 0 && x1 < 100) && (y1 >= 0 && y1 < 100)) {

                Point p1 = new Point(x1, y1);
                System.out.println("第一个点创建成功");
                Point p2 = new Point(x2, y2);
                System.out.println("第二个点创建成功");
                System.out.println("两点间的距离是：" + p1.distant(p2));
                scan.close();
                break;
            } else {
                System.out.println("对象创建失败,x和y要大于0小于100");
                continue;
            }
        }
    }


}

