package com.wangfeng.niuke.中等;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 描述
 * 输入一个单向链表和一个节点的值，从单向链表中删除等于该值的节点，删除后如果链表中无节点则返回空指针。
 *
 * 链表的值不能重复。
 *
 * 构造过程，例如输入一行数据为:
 * 6 2 1 2 3 2 5 1 4 5 7 2 2
 * 则第一个参数6表示输入总共6个节点，第二个参数2表示头节点值为2，剩下的2个一组表示第2个节点值后面插入第1个节点值，为以下表示:
 * 1 2 表示为
 * 2->1
 * 链表为2->1
 *
 * 3 2表示为
 * 2->3
 * 链表为2->3->1
 *
 * 5 1表示为
 * 1->5
 * 链表为2->3->1->5
 *
 * 4 5表示为
 * 5->4
 * 链表为2->3->1->5->4
 *
 * 7 2表示为
 * 2->7
 * 链表为2->7->3->1->5->4
 *
 * 最后的链表的顺序为 2 7 3 1 5 4
 *
 * 最后一个参数为2，表示要删掉节点为2的值
 * 删除 结点 2
 *
 * 则结果为 7 3 1 5 4
 *
 * 数据范围：链表长度满足  ，节点中的值满足
 *
 * 测试用例保证输入合法
 *
 *
 * 输入描述：
 * 输入一行，有以下4个部分：
 * 1 输入链表结点个数
 * 2 输入头结点的值
 * 3 按照格式插入各个结点
 * 4 输入要删除的结点的值
 *
 * 输出描述：
 * 输出一行
 * 输出删除结点后的序列，每个数后都要加空格
 *
 * 示例1
 * 输入：
 * 5 2 3 2 4 3 5 2 1 4 3
 * 复制
 * 输出：
 * 2 5 4 1
 * 复制
 * 说明：
 * 形成的链表为2->5->3->4->1
 * 删掉节点3，返回的就是2->5->4->1
 * 示例2
 * 输入：
 * 6 2 1 2 3 2 5 1 4 5 7 2 2
 * 复制
 * 输出：
 * 7 3 1 5 4
 * 复制
 * 说明：
 * 如题
 */
public class 从单向链表中删除指定值的节点 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            String[] nums = in.nextLine().split(" ");

            // 获取节点数
            int nodeCount = Integer.parseInt(nums[0]);
            // 获取头节点
            int headNode = Integer.parseInt(nums[1]);
            // 获取要删除的节点
            int delNode = Integer.parseInt(nums[nums.length - 1]);
            LinkedList linkedList = new LinkedList();
            linkedList.add(headNode);
            for (int i = 2; i < nums.length - 1; i=i+2) {
                int value = Integer.parseInt(nums[i]);
                int target = Integer.parseInt(nums[i + 1]);
                linkedList.add(linkedList.indexOf(target) + 1, value);
            }
            // linkedList.remove(delNode);
            linkedList.remove(linkedList.indexOf(delNode));
            // System.out.println(linkedList.toString());
            for (int i = 0; i < linkedList.size(); i++) {
                System.out.print(linkedList.get(i) + " ");
            }
        }
    }

}
