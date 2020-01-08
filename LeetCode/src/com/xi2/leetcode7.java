package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/12 0012 - 下午 14:07
 *
 * 题目:整数反转
 */
public class leetcode7 {
    public static int reverse(int x) {
        if(x<Integer.MIN_VALUE||x>Integer.MAX_VALUE){
            return 0;
        }
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        if(s.charAt(0)=='-'){
            String substring = sb.substring(1);
            StringBuilder ss = new StringBuilder(substring);
            ss.reverse();
            int i = Integer.parseInt("-" + ss);
            return i;
        }else{
            StringBuilder reverse = sb.reverse();
            int i = Integer.parseInt(String.valueOf(reverse));
            return i;
        }
    }

    public int reverse1(int x) {
            int ans = 0;
            while (x != 0) {
                int pop = x % 10;
                if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                    return 0;
                if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                    return 0;
                ans = ans * 10 + pop;
                x /= 10;
            }
            return ans;
        }


    public static void main(String[] args) {
        int reverse = reverse(123);
        System.out.println(reverse);
    }
}
