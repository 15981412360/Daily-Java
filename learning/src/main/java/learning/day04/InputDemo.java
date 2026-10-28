package learning.day04;

import java.util.Locale;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.ROOT);
            System.out.println("请输入数量（整数）：");
            int quantity = scanner.nextInt();
            System.out.println("请输入单价（小数使用英文点号）：");
            double unitPrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("请输入一行备注：");
            String note = scanner.nextLine();

            System.out.println("数量：" + quantity);
            System.out.println("单价：" + unitPrice);
            System.out.println("备注：" + note);
            System.out.println("总价：" + quantity * unitPrice);
        }
    }
}
