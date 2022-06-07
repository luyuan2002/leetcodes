# [1919. Leetcodify Similar Friends](https://leetcode-cn.com/problems/leetcodify-similar-friends)

[English Version](/solution/1900-1999/1919.Leetcodify%20Similar%20Friends/README_EN.md)

## 题目描述

<!-- 这里写题目描述 -->

<p>Table: <code>Listens</code></p>

<pre>+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| user_id     | int     |
| song_id     | int     |
| day         | date    |
+-------------+---------+
该表没有主键，因此会存在重复的行。
该表的每一行所代表的含义是：用户（user_id）在某天（day）听了某首歌曲（song_id）。
</pre>

<p> </p>

<p>Table: <code>Friendship</code></p>

<pre>+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| user1_id      | int     |
| user2_id      | int     |
+---------------+---------+
(user1_id, user2_id) 是该表的主键。
该表的每一行所代表的含义是，用户（user1_id, user2_id）是朋友。
注意：user1_id &lt; user2_id。
</pre>

<p> </p>

<p>请写一段SQL查询获取到兴趣相同的朋友。用户 <code>x</code> 和 用户 <code>y</code> 是兴趣相同的朋友，需满足下述条件：</p>

<ul>
	<li>用户 <code>x</code> 和 <code>y</code> 是朋友，并且</li>
	<li>用户 <code>x</code> and <code>y</code> 在同一天内听过相同的歌曲，且数量大于等于三首.</li>
</ul>

<p>结果表无需排序。注意：返回的结果需要和源数据表的呈现方式相同 （例如， 需满足 <code>user1_id &lt; user2_id</code>）。</p>

<p>结果表的格式如下例：</p>

<p> </p>

<pre>Listens table:
+---------+---------+------------+
| user_id | song_id | day        |
+---------+---------+------------+
| 1       | 10      | 2021-03-15 |
| 1       | 11      | 2021-03-15 |
| 1       | 12      | 2021-03-15 |
| 2       | 10      | 2021-03-15 |
| 2       | 11      | 2021-03-15 |
| 2       | 12      | 2021-03-15 |
| 3       | 10      | 2021-03-15 |
| 3       | 11      | 2021-03-15 |
| 3       | 12      | 2021-03-15 |
| 4       | 10      | 2021-03-15 |
| 4       | 11      | 2021-03-15 |
| 4       | 13      | 2021-03-15 |
| 5       | 10      | 2021-03-16 |
| 5       | 11      | 2021-03-16 |
| 5       | 12      | 2021-03-16 |
+---------+---------+------------+

Friendship table:
+----------+----------+
| user1_id | user2_id |
+----------+----------+
| 1        | 2        |
| 2        | 4        |
| 2        | 5        |
+----------+----------+

Result table:
+----------+----------+
| user1_id | user2_id |
+----------+----------+
| 1        | 2        |
+----------+----------+

用户 1 和 2 是朋友, 并且他们在同一天内都听了10、11、12的歌曲。所以，他们是兴趣相同的朋友。
用户 1 和 3 在同一天内都听了10、11、12的歌曲，但他们不是朋友。
用户 2 和 4 是朋友，但他们同一天内听过相同的歌曲的数量小于3。
用户 2 和 5 是朋友，并且在都听了了10、11、12的歌曲，但不在同一天内。</pre>

## 解法

<!-- 这里可写通用的实现逻辑 -->

<!-- tabs:start -->

### **SQL**

<!-- 这里可写当前语言的特殊实现逻辑 -->

```sql

```

<!-- tabs:end -->