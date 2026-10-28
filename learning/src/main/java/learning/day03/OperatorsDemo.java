package learning.day03;

public class OperatorsDemo {
    public static void main(String[] args) {
        int pens = 23;
        int capacity = 5;
        int fullBoxes = pens / capacity;
        int remainingPens = pens % capacity;

        System.out.println("完整盒数：" + fullBoxes);
        System.out.println("剩余笔数：" + remainingPens);
        System.out.println("还原笔数：" + (fullBoxes * capacity + remainingPens));

        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4));
        System.out.println("20 / 3 * 3 = " + (20 / 3 * 3));
        System.out.println("合计：" + 2 + 3);
        System.out.println("合计：" + (2 + 3));
    }
}
