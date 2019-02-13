package com.lu.utils;

import com.lu.item.ListNode;

public class Utils {
    /**
     * 遍历单向链表
     * @param head 链表head
     */
    public static void traversalLinkedList(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.val).append("->");
            head = head.next;
        }
        builder.append("NULL");
        System.out.println(builder.toString());
    }

    /**
     * 遍历数组
     */
    public static void traversalArray(int[] nums) {
        if (nums == null) {
            System.out.println("result is null");
        } else {
            System.out.print("[");
            for (int i = 0; i < nums.length - 1; i++) {
                System.out.print(nums[i] + ",");
            }
            System.out.println(nums[nums.length - 1] + "]");
        }
    }
}
