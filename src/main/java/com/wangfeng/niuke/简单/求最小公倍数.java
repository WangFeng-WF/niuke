package com.wangfeng.niuke.简单;

import java.util.Scanner;

/**
 * 描述
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 *
 * 数据范围：
 * 输入描述：
 * 输入两个正整数A和B。
 *
 * 输出描述：
 * 输出A和B的最小公倍数。
 *
 * 示例1
 * 输入：
 * 5 7
 * 复制
 * 输出：
 * 35
 * 复制
 * 示例2
 * 输入：
 * 2 4
 * 复制
 * 输出：
 * 4
 */
public class 求最小公倍数 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] numArr = scanner.nextLine().split(" ");
            int oneNum = Integer.parseInt(numArr[0]);
            int twoNum = Integer.parseInt(numArr[1]);
            if (oneNum > twoNum) {
                if (oneNum % twoNum == 0) {
                    System.out.println(oneNum);
                } else {
                    for (int i = oneNum; i <= oneNum * twoNum; i++) {
                        if (i % oneNum == 0 && i % twoNum == 0) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            } else {
                if (twoNum % oneNum == 0) {
                    System.out.println(twoNum);
                } else {
                    for (int i = twoNum; i <= oneNum * twoNum; i++) {
                        if (i % oneNum == 0 && i % twoNum == 0) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }

        }
    }

}
