package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/10 0010 - 下午 15:55
 *
 * 题目:删除链表的倒数第N个节点
 */


public class leetcode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre, end = pre;
        while(n != 0) {
            start = start.next;
            n--;
        }
        while(start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }
}

