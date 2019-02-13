package com.lu;

import com.lu.item.ListNode;
import com.lu.utils.Utils;

/**
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class RemoveLinkedListElements {

    private static ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode current = header;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return header.next;
    }

    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(6);
        ListNode t4 = new ListNode(3);
        ListNode t5 = new ListNode(4);
        ListNode t6 = new ListNode(5);
        ListNode t7 = new ListNode(6);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        t5.next = t6;
        t6.next = t7;
        Utils.traversalLinkedList(t1);
        Utils.traversalLinkedList(removeElements(t1, 6));
    }
}
