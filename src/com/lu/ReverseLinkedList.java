package com.lu;

import com.lu.item.ListNode;
import com.lu.utils.Utils;

/**
 * 反转一个单链表。
 * 示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseLinkedList {

    private static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(6);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        Utils.traversalLinkedList(n1);
        Utils.traversalLinkedList(reverseList(n1));
    }
}
