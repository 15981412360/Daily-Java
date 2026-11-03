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
            // 复查 2026-11-03：已由学习者改为范围内条件，40 组组合全部通过。
            if (age <= 60 && age >= 18) {
                if (isTicket || isVIP) {
                    in=true;
                }
            }
        }
        // TODO 打印带标签的 boolean 结果。
        // 复查：已补充带标签的 boolean 输出，符合要求。
        System.out.println("入场："+in);
        if(in){System.out.println("能进");}
        else{
            System.out.println("不能进");}
    }
}
