package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/3 0003 - 下午 14:29
 *
 * 题目：斐波那契数列
 */
public class Q_7 {
    public static int Fibonacci(int n) {
        if(n<1){
            return 0;
        }else if(n == 1||n == 2){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args) {
        int fibonacci = Fibonacci(5);
        System.out.println(fibonacci);
    }
}
