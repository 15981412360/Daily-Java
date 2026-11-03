package learning.day06;

import java.util.Scanner;

public class LeapYearPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO 读取 int 年份，先判断是否在 1～9999 范围内。
        int year=sc.nextInt();
        if (year>=1 && year<=9999){
            if(year%400==0){
                System.out.println("闰年");
            }else if(year%4==0 && year%100 !=0){
                System.out.println("闰年");
            }else{

                System.out.println("平年");
            }
        }else {
            System.out.println("年份无效");
        }
        // TODO 按讲义给出的公历规则判断闰年，使用 % 和条件分支。
        // 一次只输出“年份无效”“闰年”“平年”中的一项。
    }
}
