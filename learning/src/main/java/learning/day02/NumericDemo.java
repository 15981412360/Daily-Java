package learning.day02;

public class NumericDemo {
    public static void main(String[] args) {
        int numerator = 7;
        int denominator = 2;

        double afterIntegerDivision = numerator / denominator;//3->3.0
        double floatingDivision = numerator / 2.0;//3.5
        double castBeforeDivision = (double) numerator / denominator;//3.5
        double castAfterDivision = (double) (numerator / denominator);//3.0

        System.out.println("整数相除后赋给 double：" + afterIntegerDivision);
        System.out.println("使用小数操作数：" + floatingDivision);
        System.out.println("先转换再相除：" + castBeforeDivision);
        System.out.println("先相除再转换：" + castAfterDivision);

        double original = 6.8;
        int truncated = (int) original;//6
        System.out.println("强制转换为 int：" + truncated);

        int quantity = 4;
        int doubled = quantity * 2;//8
        quantity = 7;
        System.out.println("quantity 改为 7 后，doubled 仍为：" + doubled);
        doubled = quantity * 2;//14
        System.out.println("重新计算后的 doubled：" + doubled);
    }
}
