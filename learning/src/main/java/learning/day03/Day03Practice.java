package learning.day03;

public class Day03Practice {
    private static void hms(int totalSecond){
        int hour=totalSecond/3600;
        int minute=(totalSecond-hour*3600)/60;
        int second=totalSecond-hour*3600-minute*60;
        System.out.printf("%d秒可转化为%d小时%d分钟%d秒%n",totalSecond,hour,minute,second);
    }
    private static void howManyBook(int money,int price){
        int book=money/price;
        int cost=book*price;
        int rest=money-cost;
        System.out.println("在预算"+money+"、单价"+price+"的情况下，" +
                "最多可购买"+book+"个本子、花费"+cost+"元、剩余"+rest+"元");
    }
    public static void main(String[] args) {
        // TODO A：将总秒数拆成完整小时、分钟部分、秒部分。
        // 测试 0、59、60、3661、86399、86400，最后恢复 3661。
        // 自查：分、秒在 0～59；三部分换算回秒后等于原总秒数。
        int totalSecond=3661;
        hms(0);
        hms(59);
        hms(60);
        hms(3661);
        hms(totalSecond=86399);
        hms(86400);
        // TODO B：预算 100 元，本子单价 18 元。
        // 计算最多购买本数、实际花费、剩余预算。
        // 保持单价不变，测试预算 100、90、10、0，最后恢复 100。
        int price=18;
        howManyBook(100,price);
        howManyBook(90,price);
        howManyBook(10,price);
        howManyBook(0,price);
        // TODO C：先在日志中预测讲义中的表达式，再在这里打印验证。

        /*4, 2, 4.5, 14, 20. 21, 4, "结果：64", "结果：10"*/
    }
}
