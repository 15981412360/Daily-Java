package learning.day06;

import java.util.Scanner;

public class CompareNumbersPractice {
    public static void main(String[] args) {
        // TODO 从键盘读取两个 int。
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // TODO 用 if/else 比较：相等时输出“两数相等”，否则输出“较大值：”及较大数。
        if(a>b){
            System.out.println("较大值："+a);
        }else if(a==b){
            System.out.println("两数相等");
        }else {
            System.out.println("较大值："+b);
        }
        // 每次运行只输出一个判断结果，不要用相减的结果判断大小。
    }
}
