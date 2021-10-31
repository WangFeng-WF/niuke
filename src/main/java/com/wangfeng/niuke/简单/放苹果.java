package com.wangfeng.niuke.简单;

/**
 * 描述
 * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
 *
 * 数据范围：0 <= m <= 10    1 <= n <= 10
 *
 * 本题含有多组样例输入。
 *
 * 输入描述：
 * 输入两个int整数
 *
 * 输出描述：
 * 输出结果，int型
 *
 * 示例1
 * 输入：
 * 7 3
 * 复制
 * 输出：
 * 8
 */
public class 放苹果 {

    public static void main(String[] args) {
        System.out.println(getCount(7, 3));
    }

    private static int getCount(int m, int n) {

        if (m <= 1 || n == 1) { // 递归出口
            return 1;
        }

        if (m < n) { // 苹果数量少，肯定有空盘子
            getCount(m, m);
        }

        // 1、有空盘子，则至少有一个空盘子，先摘掉一个盘子f(m，n - 1)
        // 2、没有空盘子，苹果多，盘子少，说明先每个盘子放一个苹果，剩余的苹果分别放到盘子列f(m-n, n)
        // 最后结果 = 有空盘子情况 + 没有空盘子的情况
        return getCount(m-n, n) + getCount(m, n-1);

    }

}
