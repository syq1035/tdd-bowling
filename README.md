### 需求

给出保龄球一局中每轮的击倒球数，算出该局总分
如： 
全部没有击倒球：
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 总分为 0
每次都全中：
10，10，10，10，10，10，10，10，10，10，10，10 总分为 300


---
保龄球是以局(line)为单位，一局分为10轮(frame)，每轮有两次投球(throw)机会。一局游戏得分为10轮分数(score)之和。

在一轮中：
1. 两次投球后未能击倒全部10个球瓶(pin)，则本轮得分为击倒的球瓶数目。
2. 全中(strike): 就不能再投第二次，本轮得分为10加上后两次投球击倒的球瓶数。
3. 补中(spare): 本轮得分为10加上后续一次投球击倒的球瓶数。

唯有第10轮不同，第一次投球如果投得全中，仍要继续投完最后两个球；如果是补中，就要继续投完最后一球，结束全局。
也就是说，第十轮：

- 第一种情况：第一球全中（10个瓶子都倒了），就还有两次机会（相当于有新的一轮，计分方式与之前全中后下一轮计分方式相同）。比如后面两球第一球击倒1个，第二球击倒3个，一共击倒4个，除了第十轮的得分就是10 + 4 = 14分。
- 第二种情况：第十轮第二球补中，就继续投一球，用于计算补中后的额外积分。比如击倒2个，第十轮得分10 + 2 = 12分。
- 第三种情况：没有全中也没有补中，这两球一共击倒几个就得几分。

### 要求
- 使用TDD方式实现上述需求，注意TDD Cycle（红-绿-重构）
- YAGNI
- 小步提交
