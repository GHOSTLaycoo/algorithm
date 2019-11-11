package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/26 0026 - 下午 20:34
 *
 * 题目:两数相加
 */
public class leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode p = l1,q=l2,curr = l;
        int curry = 0;
        while(p!=null||q!=null){
            int x = (p!=null) ? p.val:0;
            int y = (q!=null) ? q.val:0;
            int num = curry+x+y;
            curry = num/10;
            curr.next = new ListNode(num%10);
            curr = curr.next;
            if(p!=null) p=p.next;
            if(p!=null) q=q.next;
        }
        if(curry>0){
            curr.next = new ListNode(curry);
        }
        return l.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
