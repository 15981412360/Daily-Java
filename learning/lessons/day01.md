# Day01：让 Java 使用你提供的数据

今天只学：运行入口、输出、变量、简单计算。先读和运行例子，再自己写练习。

## 1. 运行入口

```java
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

Java 从 `main` 方法开始执行其中的语句。`System.out.println(...)` 输出括号里的内容，并在末尾换行。语句最后通常写英文分号 `;`，花括号 `{}` 划定代码范围。

今天把 `public static void main(String[] args)` 当成固定入口模板即可，不要求一次理解每个单词。公开类名与文件名一致，例如 `Welcome` 放在 `Welcome.java`。本项目的文件还带有 `package` 行，用于说明它属于哪个包，暂时保留即可。

## 2. 变量是可以命名、保存和使用的数据

```java
String bookName = "Java 入门笔记";
int pagesPerDay = 8;
int readingDays = 3;
int totalPages = pagesPerDay * readingDays;

System.out.println("书名：" + bookName);
System.out.println("累计页数：" + totalPages);
```

- `String` 保存文本，文本用英文双引号包裹。
- `int` 保存整数，例如 `8`，这里不用加引号。
- `=` 把右侧的值保存到左侧变量，不表示数学上的等式判断。
- `*` 做乘法。`+` 可以做加法，遇到字符串时也可拼接文本。
- `totalPages` 的值从其他变量计算得到，修改输入再运行即可得到新的结果。

变量名注意大小写。`pagesPerDay` 和 `PagesPerDay` 是不同的名字。Java 区分大小写，标点也使用英文标点。

## 3. 先预测，再运行

打开并运行 `PrintDemo.java`。在运行前预测它输出什么。把 `readingDays` 从 `3` 改成 `5` 后再运行，观察累计页数如何变化，然后恢复为 `3`。

再预测下面两行分别输出什么；可以临时加到例子里验证：

```java
System.out.println(2 + 3);
System.out.println("结果：" + 2 + 3);
```

如果第二行与你想的不一样，先记在日志里，尝试加上括号 `(2 + 3)` 再观察。

## 4. 你的任务

只需修改 `src/main/java/learning/day01/Day01Practice.java` 的 `main` 方法内部，不用输入，也不用循环。不要把下面的结果全部写死成字符串。

### A：我的学习卡片

声明 `String nickname`、`int dailyMinutes`、`int studyDays`，值分别为 `Java新手`、`120`、`7`。使用这三个变量输出：

```text
昵称：Java新手
每天学习：120分钟
计划学习：7天
```

### B：计算本周总时长

使用刚才的变量，声明 `int totalMinutes` 和 `int totalHours`，分别算出总分钟与总小时；一天 120 分钟，七天恰好能换成整数小时。接着输出：

```text
累计学习：840分钟
折合：14小时
```

提示：乘法用 `*`，除法用 `/`。如果卡住，先在纸上写出“每天分钟数 × 天数”，再翻译成变量表达式。

### C：回答三个问题

在 `logs/day01.md` 填写：

1. `120` 与 `"120"` 有什么不同？
2. 为什么 `totalMinutes` 应该通过变量计算，而不直接写 `840`？
3. 如果 `studyDays` 改成 `10`，你预计总分钟数和总小时数是多少？先预测，再运行验证，之后把它恢复为 `7`。

## 5. 验收

- 程序可以编译和运行，默认值输出与上面一致。
- 修改学习天数后，总时长自动变化。
- 能解释自己写的变量和每一行输出。
- 日志写下你实际遇到的问题；没有遇到就写“暂无”，不编造错误。

完成后保存所有文件，在聊天中说：“Day01 已完成，请批改。”可以带上你的疑问。第一轮批改先给提示，由你修改。
