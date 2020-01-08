package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/12 0012 - 下午 14:31
 *
 * 题目:合并K个排序链表
 */
public class leetcode23 {
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode node = null;
        if(lists.length==1){
            return lists[0];
        }

        for(int i=0;i<lists.length-1;i++){
            node = mergeTwoLists(lists[i],lists[i+1]);
            lists[i+1] = node;
        }
        return node;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(4,new ListNode(5)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode l3 = new ListNode(2,new ListNode(6));

        ListNode[] nodes = new ListNode[]{l1,l2,l3};

        ListNode listNode = mergeKLists(nodes);

        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
