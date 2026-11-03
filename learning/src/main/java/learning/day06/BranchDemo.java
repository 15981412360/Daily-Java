package learning.day06;

import java.util.Scanner;

public class BranchDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int battery = scanner.nextInt();
            if (battery < 0 || battery > 100) {
                System.out.println("电量无效");
            } else if (battery < 20) {
                System.out.println("低电量");
            } else if (battery < 80) {
                System.out.println("电量正常");
            } else {
                System.out.println("电量较高");
            }
        }
    }
}
