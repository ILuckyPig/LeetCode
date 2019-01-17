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
}
