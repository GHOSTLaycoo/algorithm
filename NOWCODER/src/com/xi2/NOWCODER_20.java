package com.xi2;

import java.util.*;

/**
 * @author GHOSTLaycoo
 * @date 2019/9/8 0008 - 下午 23:55
 *
 * 题目:反转链表 (25)
 */
public class NOWCODER_20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String start = in.next();
        int a = in.nextInt();
        int k = in.nextInt();
        Map<String,Node> map = new HashMap<>();
        for(int i = 0;i<a;i++){
            Node node = new Node(in.next(),in.next(),in.next());
            map.put(node.head,node);
        }
        in.close();

        List<Node> l = new ArrayList<>();

        while(!start.equals("-1")){
            Node node = map.get(start);
            l.add(node);
            start = node.next;
        }


        for(int i = 0; i<l.size()-k; i+=k) {
            int l1 = i;
            int r = i+k-1;
            while(l1<r){
                Node t = l.get(l1);
                l.set(l1, l.get(r));
                l.set(r, t);
                l1++;
                r--;
            }
        }

        int i;
        for(i = 0; i<l.size()-1; i++) {
            Node node = l.get(i);
            System.out.println(node.head+" "+node.data+" "+l.get(i+1).head);
        }
        Node node = l.get(i);
        System.out.println(node.head+" "+node.data+" -1");
    }


}

class Node{
    public String head;
    public String data;
    public String next;

    public Node(String head, String data, String next) {
        this.head = head;
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "head='" + head + '\'' +
                ", data='" + data + '\'' +
                ", next='" + next + '\'' +
                '}';
    }
}

