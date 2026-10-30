# Day05：boolean、比较运算与逻辑运算

今天让程序判断“条件是否成立”。先输出 true/false，下一课再用 if/else 根据判断执行不同语句。预计：学习和示例 25 分钟、两道编程题 60 分钟、概念题 10 分钟，其余时间用于自测和提问。

## 1. boolean：表示成立或不成立

```java
int stock = 8;
boolean hasStock = stock > 0;
System.out.println(hasStock);
```

boolean 只有两个值：`true` 和 `false`，不加引号。`"true"` 是 String 文本，与 boolean 值不同。比较表达式会产生 boolean 结果，可以赋给变量或直接打印。

## 2. 比较运算符

| 写法 | 含义 |
|---|---|
| a > b / a < b | 大于 / 小于 |
| a >= b / a <= b | 大于等于 / 小于等于 |
| a == b | 判断数值是否相等 |
| a != b | 判断数值是否不相等 |

`=` 是赋值，`==` 是比较；二者作用不同。今天比较整数和布尔值，不用 `==` 比较字符串内容；字符串比较之后会学 equals。

Java 不支持数学式的连续范围判断。例如 0 <= temperature <= 30 不能这样写；两次比较需要用逻辑运算连接。

## 3. &&、||、!

```java
int temperature = 22;
boolean comfortable = temperature >= 18 && temperature <= 26;
boolean extreme = temperature < 0 || temperature > 35;
boolean notComfortable = !comfortable;
```

- `&&`：且，两个条件都成立才是 true。
- `||`：或，至少一个条件成立就是 true；两者同时成立也为 true。
- `!`：非，将 true 与 false 互换。

范围一般用且；两个互相独立的可选资格一般用或。判断时先把规则拆成小条件，再用有含义的 boolean 变量组合。

常见优先级：`!` 高于 `&&`，`&&` 高于 `||`。涉及多种逻辑运算时，优先加括号明确分组，例如 `(conditionA || conditionB) && conditionC`。

## 4. 短路：可能不执行右侧表达式

```java
int divisor = 0;
boolean largeEnough = divisor != 0 && 100 / divisor > 5;
```

左侧已经为 false，&& 的最终结果不可能是 true，因此跳过右侧，避免整数除以零。|| 在左侧为 true 时跳过右侧。

这个行为使条件顺序有时很重要。今天用 `&&` 和 `||`；单个 `&`、`|` 还有其他用途，对 boolean 使用时也不会短路，不能随意替换。

## 5. 运行示例

打开 `src/main/java/learning/day05/BooleanDemo.java`。示例演示温度范围、取反和短路保护。尝试修改 temperature、divisor，再运行观察；不用抄写结果表。

如果需要读取布尔值，可使用 Scanner 的 `nextBoolean()`：控制台输入英文 `true` 或 `false`，不带引号，不用“是/否”。本课都保证输入格式正确，不要求处理非数字或错误布尔文本。

## 6. 编程题 A：成绩是否合法、是否及格

在 `ScoreCheckPractice.java` 中，从键盘读取一个 int 成绩，计算并输出三个有标签的 boolean：

1. 成绩是否合法：0～100，包含两个端点。
2. 是否及格：成绩合法，且至少为 60。
3. 是否非法：合法条件的相反结果，使用 `!` 表达。

输入 -1 或 101 不是输入格式错误，是本题必须正确识别的非法成绩。不能只判断成绩 >= 60，否则 101 也会被当成及格。

| 输入 | 合法 | 及格 | 非法 |
|---|---|---|---|
| -1 | false | false | true |
| 0 | true | false | false |
| 59 | true | false | false |
| 60 | true | true | false |
| 100 | true | true | false |
| 101 | false | false | true |

每次运行只处理一个成绩，使用比较和逻辑表达式即可，暂时不必写 if 或循环。

## 7. 编程题 B：活动入场资格

在 `EntryCheckPractice.java` 中依次读取：年龄 int、是否持票 boolean、是否会员 boolean、是否被禁止入场 boolean。

规则必须全部满足：

- 年龄在 18～60，包含端点。
- 持票或者是会员，满足其中一种即可，也允许同时满足。
- 没有被禁止入场。被禁止时，即使其他条件全部满足也不能进入。

输出一个清晰标记的 boolean，表示是否可以入场。可以用多个变量拆解条件，不要针对测试值写死结果。

| 年龄 | 持票 | 会员 | 被禁止 | 可入场 |
|---|---|---|---|---|
| 17 | true | false | false | false |
| 18 | true | false | false | true |
| 60 | false | true | false | true |
| 61 | true | true | false | false |
| 25 | false | false | false | false |
| 25 | true | true | false | true |
| 25 | true | true | true | false |
| 25 | false | true | true | false |

按同一行用空格分隔或分成四行输入都可以。例：`18 true false false`。

## 8. 两道独立书面题

请在 `answers/day05.md` 中简短作答。题目讨论类型和语言行为，不要求总结上面程序的输出，也不用重复填写测试表。

1. 数据类型有什么作用？`boolean enabled = true;` 与 `String enabledText = "true";` 分别保存什么，为什么不宜把它们当成同一种数据？
2. 什么是逻辑运算的短路？在右侧表达式可能出错或执行额外操作时，为什么是否执行右侧会影响程序？请用一个独立于成绩/入场题的场景说明，不需要写完整程序。

## 9. 交付

保存两份练习代码与概念题答案，告诉助手“Day05 已完成”。助手负责测试正常值、边界值与条件组合，填写日志并上传。你无需运行 Git 命令或抄写测试结果。
