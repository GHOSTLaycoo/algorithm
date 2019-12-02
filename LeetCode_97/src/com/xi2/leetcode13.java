package com.xi2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/22 0022 - 下午 14:58
 *
 * 题目:罗马数字转整数
 */
public class leetcode13 {

    public static int romanToInt(String s) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int num = 0;
        for(int i=0;i<s.length();){
            if(s.length()>i+1&&map.containsKey(s.substring(i,i+2))){
                num+=map.get(s.substring(i,i+2));
                i = i+2;
            }else{
                num+=map.get(s.substring(i,i+1));
                i++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int mcmxciv = romanToInt("III");
        System.out.println(mcmxciv);
    }
}
