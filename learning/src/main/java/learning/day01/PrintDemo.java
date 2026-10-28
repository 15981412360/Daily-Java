package learning.day01;

public class PrintDemo {
    public static void main(String[] args) {
        String bookName = "Java 入门笔记";
        int pagesPerDay = 8;
        int readingDays = 3;
        int totalPages = pagesPerDay * readingDays;

        System.out.println("书名：" + bookName);
        System.out.println("累计页数：" + totalPages);
    }
}
