package com.wangfeng.niuke.简单;

import java.util.Scanner;

/**
 * 描述
 * 对字符串中的所有单词进行倒排。
 *
 * 说明：
 *
 * 1、构成单词的字符只有26个大写或小写英文字母；
 *
 * 2、非构成单词的字符均视为单词间隔符；
 *
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 *
 * 4、每个单词最长20个字母；
 *
 * 数据范围：字符串长度满足
 * 输入描述：
 * 输入一行以空格来分隔的句子
 *
 * 输出描述：
 * 输出句子的逆序
 *
 * 示例1
 * 输入：
 * I am a student
 * 复制
 * 输出：
 * student a am I
 * 复制
 * 示例2
 * 输入：
 * $bo*y gi!r#l
 * 复制
 * 输出：
 * l r gi y bo
 */
public class 单词倒排序 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String fi = str;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if ((c + 0 >= 'A' && c + 0 <= 'Z') || (c + 0 >= 'a' && c + 0 <= 'z') || c == ' ') {

                    //System.out.print(c);
                } else {
                    fi = fi.replace(String.valueOf(c), " ");
                    //System.out.print(c);
                }
            }
            String[] strArr = fi.split(" ");
            for (int i = strArr.length - 1; i >= 0; i--) {
                System.out.print(strArr[i] + " ");
            }
        }
    }
}
