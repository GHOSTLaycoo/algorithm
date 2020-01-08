package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/12 0012 - 上午 10:52
 */
public class MyLinked {

    ListNode head = null;

    public void addNode(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
