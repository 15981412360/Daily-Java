# Java 后端学习档案

每天 2 小时，从零开始，目标是独立解决基础问题，并完成可测试、可运行的 Spring Boot 后端。

## 从这里开始

1. 在 IntelliJ IDEA 中选择 **File → Open**，打开本文件所在的 `java-learning` 文件夹；若询问项目类型，选择 Maven 项目。
2. 在 **File → Project Structure → Project SDK** 中选择已有的 JDK 17：`C:\Program Files\Java\jdk-17`。Language level 选择 17。不要选 Java 8。
3. 如提示 Maven 导入，允许加载。IDEA 自带 Maven 可用；首次导入插件可能需要联网。
4. 阅读 `lessons/day01.md`，打开 `src/main/java/learning/day01/PrintDemo.java`，点击 `main` 旁的绿色运行按钮。
5. 编辑 `Day01Practice.java` 中的 TODO，运行并检查输出；填写 `logs/day01.md`。
6. 回到学习聊天，说：“Day01 已完成，请读取文件并批改。”同一电脑上无需复制全部代码。

如果 Maven 首次下载失败，可以在 IDEA 终端中直接运行以下命令，不依赖 Maven 下载：

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -encoding UTF-8 -d out src/main/java/learning/day01/PrintDemo.java src/main/java/learning/day01/Day01Practice.java
java -cp out learning.day01.PrintDemo
java -cp out learning.day01.Day01Practice
```

`pom.xml` 只是帮助 IDE 识别项目，第一课暂时不用理解它。现在无需安装数据库、Docker 或独立 Tomcat。

## 文件导航

- `PLAN.md`：32 周路线、前 14 天任务表、每日时间分配、验收规则。
- `ENVIRONMENT.md`：本机软件检查和后续补充计划。
- `lessons/`：讲义、题目、验收要求。
- `src/main/java/`：你亲手编写的代码。
- `logs/`：每日复盘与批改记录。
- `PROGRESS.md`：当前进度；新聊天时先让助手读取它。
- `GITHUB.md`：每日上传流程。

## 协作约定

先讲一个小知识点，再做少量例题，最后由你完成练习。审阅先指出错误并提供分级提示，再由你修改；你明确要求时再给完整解答。项目阶段按小功能逐步增加需求。

助手读取你保存的文件进行批改；这里尚未建立 IDEA 实时联动。每天学完后触发一次审阅与上传即可，未来日期的学习和上传不会凭本次对话自动发生。
