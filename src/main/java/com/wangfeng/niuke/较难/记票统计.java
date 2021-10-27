package com.wangfeng.niuke.较难;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 描述
 * 请实现一个计票统计系统。你会收到很多投票，其中有合法的也有不合法的，请统计每个候选人得票的数量以及不合法的票数。
 * 本题有多组样例输入。
 *
 * 数据范围：每组输入中候选人数量满足  ，总票数量满足
 * 输入描述：
 * 输入候选人的人数n，第二行输入n个候选人的名字（均为大写字母的字符串），第三行输入投票人的人数，第四行输入投票。
 *
 * 输出描述：
 * 按照输入的顺序，每行输出候选人的名字和得票数量，最后一行输出不合法的票数。
 *
 * 示例1
 * 输入：
 * 4
 * A B C D
 * 8
 * A D E CF A GG A B
 * 复制
 * 输出：
 * A : 3
 * B : 1
 * C : 0
 * D : 1
 * Invalid : 3
 */
public class 记票统计 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 获取参赛人数
            int partCount = Integer.parseInt(scanner.nextLine());
            // 参赛人姓名
            String names = scanner.nextLine();
            String[] nameArr = names.split(" ");
            // 投票人数
            int voteCount = Integer.parseInt(scanner.nextLine());
            // 投票详情
            String voteDetail = scanner.nextLine();
            String[] voteArr = voteDetail.split(" ");

            // System.out.println("参赛人数：" + partCount + ", 参赛人：" + names + ", 投票人数：" + voteCount + ", 投票详情：" + voteDetail);

            int effective = 0; // 有效票数
            for (String name : nameArr) {
                int count = 0;
                for (String vote : voteArr) {
                    if (name.equals(vote)) {
                        count++;
                    }
                }
                effective += count;
                System.out.println(name + " : " + count);
            }
            System.out.println("Invalid : " + (voteArr.length - effective));
        }
    }
}
