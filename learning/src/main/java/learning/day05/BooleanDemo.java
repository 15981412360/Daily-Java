package learning.day05;

public class BooleanDemo {
    public static void main(String[] args) {
        int temperature = 22;
        boolean comfortable = temperature >= 18 && temperature <= 26;
        boolean extreme = temperature < 0 || temperature > 35;
        System.out.println("温度舒适：" + comfortable);
        System.out.println("温度极端：" + extreme);
        System.out.println("温度不舒适：" + !comfortable);

        int divisor = 0;
        boolean largeEnough = divisor != 0 && 100 / divisor > 5;
        System.out.println("满足安全除法条件：" + largeEnough);
        System.out.println("与 22 相等：" + (temperature == 22));
        System.out.println("与 22 不相等：" + (temperature != 22));
    }
}
