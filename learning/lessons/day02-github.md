# Day02 加餐：亲手把学习过程记录到 GitHub

本次把提交作为练习，由你亲手操作。可以先提交 Day01，再学 Day02；也可以等今日练习结束一并提交。提交说明必须如实区分“已写练习”和“仅准备模板”。

## 1. 先理解保存发生在哪里

```text
编辑并保存文件（工作区）
          ↓ git add
选择准备提交的文件内容（暂存区）
          ↓ git commit
形成有说明和编号的本地版本（本地仓库）
          ↓ git push
把提交发送到 GitHub（远端仓库）
```

Git 是本机的版本管理工具；GitHub 是托管远端仓库的平台。保存文件、提交版本、上传版本是三个不同动作。push 上传的是提交，未提交的编辑不会一起上传。

你已经克隆过仓库，无需再次 init、clone 或添加 origin。origin 是远端地址的名字，main 是当前分支名。

## 2. 终端位置与当前已知问题

在 IDEA 的 Terminal 中执行（PowerShell）：

```powershell
Set-Location 'D:\code\Java\Daily-Java'
git status
```

本次助手检查时，普通 git status 报了 `detected dubious ownership`：这个目录属于 Administrators，执行 Git 的用户不同。如果你也遇到它，且确认这就是自己克隆的学习仓库，执行下面这一条，再重试 status：

```powershell
git config --global --add safe.directory 'D:/code/Java/Daily-Java'
```

这会把这个具体目录加入当前用户的 Git 信任列表，写入用户级 Git 配置；只加这一条精确路径。助手尚未替你修改全局配置。若你的终端本来没有此错误，就不用执行。

## 3. 查看仓库与差异

依次执行：

```powershell
git status --short
git remote -v
git branch --show-current
git diff -- learning/src/main/java/learning/day01/Day01Practice.java
git log -3 --oneline
```

- status：列出当前改动。`??` 是尚未跟踪的新文件；` M` 是已跟踪但尚未暂存的修改；`M ` 是已暂存修改。出现 `MM` 表示暂存后又改了文件。
- remote：本项目 origin 应是 `https://github.com/15981412360/Daily-Java.git`。
- branch：预期 main。若不同，先确认当前分支再继续。
- diff：查看已跟踪文件尚未暂存的具体变化，通常 `+` 是增加、`-` 是删除。默认 diff 不显示未跟踪新文件的正文；新文件可先在 IDE 阅读，add 后用 cached diff 检查。
- log：查看已经存在的本地提交；按 q 可退出分页显示。

本次新增的根目录 `.gitignore` 会忽略根目录 `.idea/` 以及编译输出。原本只有 learning/.gitignore，覆盖不到上一级的 IDEA 设置。忽略规则不会删除这些本地文件，也不会自动取消已跟踪的文件。

## 4. 第一次实操：提交 Day01

先补充 Day01 日志，再执行：

```powershell
git add -- learning/src/main/java/learning/day01/Day01Practice.java learning/logs/day01.md
git diff --cached
git status --short
```

`--cached` 显示即将提交的内容。确认暂存区只有你想提交的内容，然后执行：

```powershell
git commit -m "study: complete Day01 practice and record review"
git log -1 --oneline
```

如果日志仍有未完成项，可以把说明改为 `study: record Day01 practice and pending review fixes`。

注意：add 保存的是执行 add 那一刻的内容。add 之后继续编辑，需要再次 add，才能让新修改进入这次提交。[Git 官方 add 说明](https://git-scm.com/docs/git-add/)

如果 Git 提示没有作者身份，先查看：

```powershell
git config user.name
git config user.email
```

只有未配置时，才用 `git config --local user.name "你的提交署名"` 和 `git config --local user.email "你的提交邮箱"` 设置本仓库身份；把引号内的说明替换成真实选择。公开仓库若想隐藏邮箱，可使用 GitHub 邮箱设置里提供的 noreply 邮箱。不要直接提交上述中文占位值。

## 5. 上传并核对

```powershell
git push origin main
```

如需要登录，按 Git Credential Manager 或浏览器提示完成。成功后到 [Daily-Java 仓库](https://github.com/15981412360/Daily-Java) 查看最新提交，并打开 `learning/src/main/java/learning/day01/Day01Practice.java` 核对自己的代码。[GitHub 官方 push 说明](https://docs.github.com/en/get-started/using-git/pushing-commits-to-a-remote-repository)

可以复制该提交页面链接，填到 Day01 日志，随下次提交保存。刚提交完成再补链接会产生新的本地修改，这是正常的。

如果提示远端有更新、需要先拉取，保留当前文件，把完整错误发给助手一起处理。本次仓库已有未提交的课程准备内容，不要盲目强制推送或清空工作区。

## 6. 第二次实操：提交 Day02 与课程准备

写完练习并检查差异后：

```powershell
git status --short
git diff
git add -- .gitignore learning
git diff --cached --stat
git diff --cached
git commit -m "study: add Day02 numeric exercises and Git notes"
git push origin main
git status --short
```

这次 add 的范围包含课程文件夹中的改动，所以一定先看暂存区，确认没有不该上传的本地配置或其他内容。如果只提交了讲义和空骨架，提交说明改为 `docs: prepare Day02 and Git practice`。

如果暂存了不想提交的文件，可以用 `git restore --staged -- 文件路径` 取消暂存，它会保留工作区里的编辑内容。暂时不要使用不带 `--staged` 的 restore 来试验。

## 7. clone 与 pull 何时用

- clone：第一次在新的位置取得完整仓库。
- pull：在已有本地仓库中取回远端更新并整合到当前分支。
- push：发送已经创建的本地提交。

以后在一天开始前，确认工作区干净且当前分支正确，再按需执行 `git pull --ff-only`。它只接受可以直接前移的更新；如分支分叉会停止，届时一起处理。今天已有未提交文件，先完成上述提交练习。

## 验收

能用自己的话解释 add、commit、push 的区别；至少亲手创建并上传一个真实学习提交；在网页确认它；把遇到的命令错误和处理方式记在 Day02 日志。
