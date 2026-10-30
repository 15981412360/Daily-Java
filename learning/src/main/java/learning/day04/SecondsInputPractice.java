package learning.day04;

import java.util.Scanner;

public class SecondsInputPractice {
    public static void main(String[] args) {
        // TODO 从键盘读取一个非负整数总秒数。
        Scanner sc =new Scanner(System.in);
        int totalSecond=sc.nextInt();
        // TODO 计算并输出完整小时、分钟部分和秒部分。
        int hour=totalSecond/3600;
        int minute=(totalSecond-hour*3600)/60;
        int second=(totalSecond-hour*3600-minute*60);
        // 每次运行处理一组输入；小时可超过 23。
        System.out.printf("%d秒，可化为%d小时%d分钟%d秒\n",totalSecond,hour,minute,second);
    }
}
