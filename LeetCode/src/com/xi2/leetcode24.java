package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/12 0012 - 下午 14:51
 *
 * 题目:两两交换链表中的节点
 */
public class leetcode24 {
    public static ListNode swapPairs(ListNode head) {
        /*if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;*/
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(4,new ListNode(5,new ListNode(7))));

        ListNode listNode = swapPairs(l1);

        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
