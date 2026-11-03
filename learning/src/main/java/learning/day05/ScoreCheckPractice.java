package learning.day05;

import java.util.Scanner;

public class ScoreCheckPractice {
    public static void main(String[] args) {
        // TODO 读取一个整数成绩。
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        // TODO 用 boolean 变量表示是否合法、是否及格、是否非法。
        boolean heFa= 0<= score && score<=100;
        boolean jiGe= heFa && score >=60;
        boolean feiFa=!heFa;
        // TODO 输出三个结果，并配上清晰的标签。
        // 复查 2026-11-03：已补齐三个 boolean 输出，9 组输入全部通过。
        System.out.println("合法："+heFa+"\n及格："+jiGe+"非法："+feiFa);
        System.out.print("当前成绩属于");
        if(heFa){
            System.out.print("合法");
        }else{
            System.out.print("非法");
        }
        System.out.print("范围内");
        if(heFa){
            if(jiGe){
                System.out.print(", 且及格");
            }else{
                System.out.print(", 且不及格");
            }
        }
        // 本题不需要 if、循环或处理非整数文本。
    }
}
