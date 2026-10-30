package learning.day04;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Day04Practice {
    public static void main(String[] args) {
        // TODO 创建一个 Scanner，依次读取完整昵称、每天分钟数、学习天数。
        Scanner scanner=new Scanner(System.in);
        String nickName=scanner.nextLine();
        int dailyMinute=scanner.nextInt();
        int day= scanner.nextInt();
        // TODO 计算并输出昵称、累计分钟数、带小数的累计小时数。
        int totalMinute=day*dailyMinute;
        DecimalFormat df =new DecimalFormat("0.00");
        double totalHour=(double)totalMinute/60;
        System.out.printf("%s在每天学习%d分钟的情况下，需要学习%d天，共%d分钟，即%s小时，才能完成学业。",nickName,dailyMinute,day,totalMinute,df.format(totalHour));

        // 只处理一组输入；不要把测试数据或结果写死。
    }
}
