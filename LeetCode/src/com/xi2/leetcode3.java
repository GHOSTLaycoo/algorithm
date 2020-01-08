package com.xi2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/27 0027 - 下午 22:51
 *
 * 题目:无重复字符的最长子串
 */
public class leetcode3 {
    public static int lengthOfLongestSubstring(String s) {
        if("".equals(s)){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int Max = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                boolean add = set.add(s.charAt(j));
                if(!add||s.length()==1){
                    if(set.size()>Max){
                        Max = set.size();
                    }
                    set.clear();
                    break;
                }
            }
        }
        return Max;
    }

    public static void main(String[] args) {
        String s = "c";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
