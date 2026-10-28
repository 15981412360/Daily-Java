package learning.day02;

import java.text.DecimalFormat;

public class Day02Practice {
    private static double CtoH(double c) {
        return c * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.##");
        // TODO A：声明摄氏温度变量，计算华氏温度，并打印两者。
        // 测试 0、25、37.5，最后保留 37.5。
        double c = 0;
        System.out.printf("在%s摄氏度下，预期华氏度为%s\n",df.format(c),df.format(CtoH(c)));
        c = 25;
        System.out.printf("在%s摄氏度下，预期华氏度为%s\n",df.format(c),df.format(CtoH(c)));
        c = 37.5;
        System.out.printf("在%s摄氏度下，预期华氏度为%s\n",df.format(c),df.format(CtoH(c)));
        // TODO B：声明三个 int 成绩，计算总分与带小数的平均分。
        // 默认 80、90、95；再测试全为 100，最后恢复默认值。
        int sa=80,sb=90,sc=95;
        double total=sa+sb+sc;
        double avg=total/3;
        System.out.println(avg);
        sa=100;
        sb=sa;
        sc=sb;
        total=sa+sb+sc;
        avg=total/3;
        System.out.println(avg);
        sa=80;
        sb=90;
        sc=95;
        total=sa+sb+sc;
        avg=total/3;
        System.out.println(avg);
        // TODO C：用 95 分钟/天、7 天，计算总分钟、整数小时和小数小时。
        // 再测试 120 分钟/天、7 天，最后恢复默认值。
        int dailyMinute=95;
        int day=7;
        System.out.printf("""
                累计分钟数：%s。
                整数小时数：%s（表示完整小时数）
                含小数的小时数：约 %.6f。%n""",
                df.format(dailyMinute*day),
                df.format(dailyMinute*day/60),
                (dailyMinute*day/60.0));
        dailyMinute=120;
        System.out.printf("""
                累计分钟数：%s。
                整数小时数：%s（表示完整小时数）
                含小数的小时数：约 %.6f。%n""",
                df.format(dailyMinute*day),
                df.format(dailyMinute*day/60),
                (dailyMinute*day/60.0));
        dailyMinute=95;
    }
}
