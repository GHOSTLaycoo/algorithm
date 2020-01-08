package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/11 0011 - 下午 16:21
 *
 * 题目:最长回文子串
 */
public class leetcode5 {
    public static String longestPalindrome(String s) {
        int max = 0;
        String s1 = "";
        if(s==null||s.length()<=0){
            return "";
        }
        for(int i = 0;i<s.length();i++){
            int l = i;
            int r = i;
            int rever1 = rever(l, r, s);
            int rever2 = rever(l,r+1,s);
            int max1 = Math.max(rever1, rever2);
            if(max1>0){
                if(max1>max){
                    max = max1;
                    s1 = s.substring((i - (max1 - 1) / 2), (i + max1 / 2) + 1);
                }
            }
        }
        return s1;
    }

    private static int rever(int l, int r, String s) {
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }

    public static void main(String[] args) {
        String s = "babad";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }
}
