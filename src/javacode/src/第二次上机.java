package javacode.src;

import com.sun.org.apache.xpath.internal.objects.XString;


import java.util.Calendar;


public class 第二次上机 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setSex('男');
        Course stu1C=new Course();
        stu1C.setPoint(80);
        System.out.println("姓名："+stu1.getName());
        System.out.println("性别："+stu1.getSex());
        System.out.println("java成绩："+stu1C.getPoint()+"\n");

        Student stu2 = new Student("李四", '男', 123, 2000);
        Course stu2C=new Course(60);
        System.out.println("姓名："+stu2.getName());
        System.out.println("性别："+stu2.getSex());
        System.out.println("java成绩："+stu2C.getPoint());
        System.out.println("年龄："+stu2.toAge(2000)+"\n");
    }
}

class Student {
    private String name;
    private char sex;
    private int code, birthdayyear;


    public Student() {
    }

    public Student(String name, char sex, int code, int birthdayyeary) {
        this.name = name;
        this.sex = sex;
        this.code = code;
        this.birthdayyear = birthdayyear;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getbirthdayyear() {
        return birthdayyear;
    }

    public void setbirthdayyear(int birthdayyear) {
        this.birthdayyear = birthdayyear;
    }

    public int toAge(int birthdayyear) {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(Calendar.YEAR) - birthdayyear);


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", code=" + code +
                ", birthdayyear=" + birthdayyear +
                '}';
    }

}
class Course{
    private int point;
    static int average,sum;
    public Course(){

    }
    public Course(int point){
        this.point=point;
    }
    public void setPoint(int point){
        this.point=point;
    }
    public int getPoint(){
        return point;

    }


}