package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/14 0014 - 下午 16:16
 *
 * 题目:回文数
 */
public class leetcode9 {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }
}
