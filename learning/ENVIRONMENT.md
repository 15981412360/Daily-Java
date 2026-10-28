# 本机环境检查

检查日期：2026-10-28。范围：命令行、Windows 应用卸载注册信息、已确认 IDEA 安装目录；没有遍历所有磁盘。因此“未检测到”不等于确定未安装。

| 工具 | 实测结果 | 当前安排 |
|---|---|---|
| JDK | java / javac 均为 17.0.12 | 足够入门，项目 SDK 统一使用 17 |
| JAVA_HOME | C:\Program Files\Java\jdk-17 | 与命令行实际版本一致 |
| IntelliJ IDEA | 2025.1.3，产品代码 IU | 已安装；未检查许可证与插件启用状态 |
| Maven | IDEA 自带 3.9.9，已执行版本检查 | 可以从 IDEA 使用；mvn 尚未加入 PATH |
| Git | 2.45.1.windows.1 | 已执行并验证 HTTPS 推送到 Daily-Java 成功 |
| VS Code | 1.132.0 | 可作备用编辑器，本路线优先使用 IDEA |
| 其他 Java | 检测到 Java 8、JDK 19 等多个版本 | 本课程先固定 JDK 17，不必卸载旧版本 |
| MySQL / PostgreSQL / 数据库 GUI | 本次检测未发现 | 第 15 周再确认并补充 MySQL |
| Docker / Gradle | 命令行未检测到 | 当前不需要 |
| GitHub CLI | gh 不在 PATH | 日常 Git 推送不要求安装 gh |

IDEA 内置 Maven 可执行位置：

```text
C:\Program Files\JetBrains\IntelliJ IDEA 2025.1.3\plugins\maven\lib\maven3\bin\mvn.cmd
```

当前环境足以开始。Spring Boot 官方系统要求为 Java 17 及以上、Maven 3.6.3 及以上，现有环境满足这两个基础要求：[官方要求](https://docs.spring.io/spring-boot/system-requirements.html)。后续第三方依赖也要核对兼容性；正式联网部署前更新到受维护 JDK 的最新补丁，具体版本届时确认。

后续按阶段补充数据库与 HTTP 调试工具；不必一次性安装整套后端工具。Spring Boot 初学项目使用内嵌服务器，不需要单独安装 Tomcat。

本机默认终端编码为 GBK，项目统一使用 UTF-8；手工编译使用 `javac -encoding UTF-8`，IDEA 文件编码设置为 UTF-8。
