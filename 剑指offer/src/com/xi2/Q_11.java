package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/16 0016 - 下午 17:41
 *
 * 题目:二进制中1的个数
 */
public class Q_11 {
    public static int NumberOf1(int n) {
        char[] string = Integer.toBinaryString(n).toCharArray();
        int x = 0;
        for (char c : string) {
            if(c=='1'){
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int i = NumberOf1(10);
        System.out.println(i);
    }
}
