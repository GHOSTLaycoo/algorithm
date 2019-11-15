package com.xi2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/15 0015 - 下午 15:31
 *
 * 题目:从尾到头打印链表
 */
public class Q_3 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> temp= new ArrayList<Integer>();
        if(listNode!=null)
        {
            temp.add(listNode.val);
            ListNode nextnode=listNode.next;
            while(nextnode!=null){
                temp.add(nextnode.val);
                nextnode=nextnode.next;
            }

        }
        Collections.reverse(temp);
        return temp;
    }

}

class ListNode {
       int val;
       ListNode next = null;

       ListNode(int val) {
           this.val = val;
       }
    }
