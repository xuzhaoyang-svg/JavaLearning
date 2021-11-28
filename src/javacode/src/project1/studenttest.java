package javacode.src.project1;


class Student {
    private String name;
    private String studentnumber;
    private String sex;
    private int year;
    private int month;
    private int day;
    private Course course;

    Student(){
        this("周杰伦","02","男",2001,1,1);
    }
    Student(String name,String studentnumber,String sex,int year,int month,int day){
        this.name=name;
        this.studentnumber=studentnumber;
        this.sex=sex;
        this.year=year;
        this.month=month;
        this.day=day;
    }
    void setname(String name) {
        this.name=name;
    }
    String getname() {
        return this.name;
    }
    void setstudentnumber(String studentnumber){
        this.studentnumber=studentnumber;
    }
    String getstudentnumber() {
        return this.studentnumber;
    }
    void setsex(String sex) {
        this.sex=sex;
    }
    String getsex() {
        return this.sex;
    }
    void setbirthday(int year,int month,int day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }
    String getbirthday() {
        return this.year+"年"+this.month+"月"+this.day+"日";
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int toage() {
        int age=2021-this.year;
        return age;
    }
    public String toString() {
        return "学生姓名:"+this.name+"\n"+"学号："+this.studentnumber+"\n"+"性别："+this.sex+"\n"+
                "出生年月："+this.year+"年"+this.month+"月"+this.day+"日"+"\n"+
                "年龄:"+toage()+"岁";
    }
    public void show() {
        System.out.println("语文成绩为："+course.getChinese()+",英语成绩为："+course.getEnglish()+",数学成绩为："+course.getMath()+",平均成绩为："+course.average());
    }

}

class Course {
    private double chinese;
    private double english;
    private double math;

    public Course(){
        this(0, 0, 0);
    }
    public Course(double chinese,double english,double math) {
        this.chinese=chinese;
        this.english=english;
        this.math   =math;
    }
    public double getChinese() {
        return chinese;
    }
    public void setChinese(double chinese) {
        this.chinese = chinese;
    }
    public double getEnglish() {
        return english;
    }
    public void setEnglish(double english) {
        this.english = english;
    }
    public double getMath() {
        return math;
    }
    public void setMath(double math) {
        this.math = math;
    }
    public double average() {
        double aver=(chinese+english+math)/3;
        return aver;
    }

}


public class studenttest{
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.toString());
        Course c1=new Course();
        s1.setCourse(c1);
        s1.show();
        System.out.println();

        Student s2=new Student();
        s2.setname("张三");
        s2.setstudentnumber("01");
        s2.setsex("男");
        s2.setbirthday(2000, 1, 1);
        System.out.println(s2.toString());
        Course c = new Course(100,80,80);
        s2.setCourse(c);
        s2.show();
        Student s3=new Student("王五","03","男",2001,5,6);
        Course s3C=new Course(70,80,90);
        s3.setCourse(s3C);
        System.out.println(s3.toString());
        s3.show();
        Student s4=new Student("王二","04","男",2001,5,6);
        Course s4C=new Course(70,70,90);
        s3.setCourse(s4C);
        System.out.println(s4.toString());
        s3.show();
        Student s5=new Student("王鱼","05","男",2001,5,6);
        Course s5C=new Course(70,90,90);
        s3.setCourse(s5C);
        System.out.println(s5.toString());
        s3.show();


    }

}
