package com.lu;

import com.lu.item.ListNode;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * HashSet、双指针
 * 相交链表
 *
 * 编写一个程序，找到两个单链表相交的起始节点。
 * listA = [4, 1, 8, 4, 5]
 * listB = [5, 0, 1, 8, 4, 5]
 * 相交节点的value为8
 */
public class IntersectionOfTwoLinkedLists {

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(0);
        ListNode b3 = new ListNode(1);
        ListNode c1 = new ListNode(8);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);
        c1.next = c2;
        c2.next = c3;
        a1.next = a2;
        a2.next = c1;
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;
        System.out.println(getIntersectionNode(a1, b1).val);
    }
}
