//package project3;
//
//
//import java.util.Scanner;
//
//public class teststudent {
//    public static void main(String[] args) {
//
//        String name;
//        String test;
//        try {
//
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("请输入：");
//            test = scanner.next();
//            String sub = test.substring(4, test.length());
//            String[] splitscore = sub.split(",");
//            int score1[] = new int[splitscore.length];
//            for (int i = 0; i < splitscore.length; i++) {
//                score1[i] = Integer.parseInt(splitscore[i]);
//                if(score1[i] < 0) {
//                    throw new OutOfRangeException("您输入的数字为负数！输入有误！");
//                } else if(score1[i] > 100) {
//                    throw new OutOfRangeException("您输入的数字大于100！输入有误！");
//            }
//        }
//            catch (OutOfRangeException e){
//                System.out.println(e.getMessage());
//        }
//
//        String[] split=test.split(",");
//        name=split[0];
//        student s1=new student(name,score1);
//
//        System.out.println("平均分："+s1.average());
//    } catch (OutOfRangeException e) {
//            e.printStackTrace();
//        }
//    }
