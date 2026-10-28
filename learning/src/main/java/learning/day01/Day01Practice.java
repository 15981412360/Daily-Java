package learning.day01;

public class Day01Practice {
    private static void out(int studyDays, int dailyMinutes){
        int totalMinutes=dailyMinutes*studyDays;
        int totalHours=totalMinutes/60;
        System.out.println("累计学习："+totalMinutes+"分钟\n折合："+totalHours+"小时");
    }
    public static void main(String[] args) {
        // TODO A：声明 nickname、dailyMinutes、studyDays，并输出学习卡片。
        String nickname="Java新手";
        int dailyMinutes=120;
        int studyDays=7;
        System.out.println("昵称："+nickname+"\n每日学习："+dailyMinutes+"分钟\n计划学习："+studyDays+"天");
        // TODO B：通过变量计算 totalMinutes 和 totalHours，并输出。
        out(studyDays,dailyMinutes);
        // TODO 自查：把 studyDays 改为 10 验证，再恢复为 7。
        studyDays=10;
        out(studyDays,dailyMinutes);
        studyDays=7;
        out(studyDays,dailyMinutes);

    }
}
