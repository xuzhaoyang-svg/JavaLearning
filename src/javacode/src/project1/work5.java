package javacode.src.project1;

import java.util.List;
import java.util.Scanner;
public class work5 {
    public static void main(String[] args){
        String First,Year,Months,m;
        int a,b,L,d,l,ll,f,D=30,Month=1;
        //定义月份字符串数组
        String[]YueFen = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        //定义大月数组
        int[] Da = {1,3,5,7,8,10,12};
        //定义小月数组
        int[] Xiao = {4,6,9,11};
        Scanner scan = new Scanner (System.in);
        System.out.println("请输入年份");
        Year = scan.nextLine();
        a = Integer.parseInt(Year);
        System.out.println("请输入第一天是周几");
        First= scan.nextLine();
        b = Integer.parseInt(First);
        while (Month<=12){
            f=2;
            Months = YueFen[Month-1];
            L=Months.length();

            //对齐月份字符串长度开始
            while (L<12){
                StringBuffer sc = new StringBuffer();
                sc.append( Months).append(" ");
                Months=sc.toString();
                L= Months.length();
            }
            //对齐月份字符串长度结束

            //添加月份开始分割横线
            for(int i=1;i<=28;i++){
                System.out.print("-");
            }
            System.out.println();
            //添加结束

            //输出某月日历
            System.out.println( Months+"\t"+Year);
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\t");

            for(int i=0;i < Da.length;i++){
                if(Month == Da[i]){
                    f=0;
                    break;
                }

            }
            for(int i=0;i < Xiao.length;i++){
                if(Month == Xiao[i]){
                    f=1;
                    break;
                }

            }
            switch (f){
                case 0:
                    D=31;
                    break;
                case 1:
                    D=30;
                    break;
                case 2:
                    int yn;
                    yn=a%4;
                    if(yn==0){
                        D=29;
                    }
                    else {
                        D=28;
                    }
                    break;
            }

            d = 4*((b+7)%7);
            String str="";
            int day=1;
            while (day<=D){
                if (day==1){
                    for(int ii=1;ii<=d;ii++){
                        StringBuffer sa = new StringBuffer();
                        sa.append(" ").append(str);
                        str=sa.toString();
                    }
                }
                m=Integer.toString(day);
                l=m.length();
                for (int sw=0;sw<4;sw++){
                    if (l<4){
                        String n = m;
                        m=n+" ";
                        l=m.length();
                    }
                }
                String str2=str;
                str=str2+m;
                ll=str.length();
                if (ll == 28||day == D){
                    System.out.println(str);
                    str="";
                }
                day++;
            }
            System.out.println();
            //结束输出日历

            //添加月份结束分割线
            for(int i=1;i<=28;i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.println();
            System.out.println();
            //添加完毕

            //月份增加，进入下一个月
            Month ++;
            int w,y;
            w=D%7;
            y=b;
            b=(y+w)%7;
        }
    }
}

