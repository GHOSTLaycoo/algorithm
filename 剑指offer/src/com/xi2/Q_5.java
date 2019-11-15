package com.xi2;

import java.util.Stack;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/15 0015 - 下午 16:52
 *
 * 题目:用两个栈实现队列
 */
public class Q_5 {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        if(stack2.empty()){
            stack1.push(node);
        }else{
            stack1.push(stack2.pop());
            stack1.push(node);
        }
    }

    public static int pop() {
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
        push(4);
        System.out.println(pop());
        push(5);
        System.out.println(pop());
        System.out.println(pop());
    }
}
