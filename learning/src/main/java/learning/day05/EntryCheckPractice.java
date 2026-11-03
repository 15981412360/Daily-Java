package learning.day05;

import java.util.Scanner;

public class EntryCheckPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO 依次读取年龄、是否持票、是否会员、是否被禁止。
        int age=sc.nextInt();
        boolean isTicket=sc.nextBoolean();
        boolean isVIP=sc.nextBoolean();
        boolean isForbidden=sc.nextBoolean();
        // TODO 根据讲义规则组合条件，计算是否可以入场。
        boolean in=false;
        if(!isForbidden){
            // 审阅 2026-11-03：下面表示“年龄不在允许范围”，当前却在该分支允许入场。
            // 请重新对应允许条件与执行分支；用 17、18、60、61 岁核对端点。
            if (age > 60 || age < 18) {
                if (isTicket || isVIP) {
                    in=true;
                }
            }
        }
        // TODO 打印带标签的 boolean 结果。
        // 审阅：文字提示可保留，但还需按题目要求输出带标签的 boolean in。
        if(in){System.out.println("能进");}
        else{
            System.out.println("不能进");}
    }
}
