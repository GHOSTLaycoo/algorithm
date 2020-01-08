package com.xi2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/10 0010 - 下午 14:30
 *
 * 题目:电话号码的字母组合
 */
public class leetcode17 {
   static Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    static List<String> com = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {
        if(digits.length()!=0){
            assembled("",digits);
        }
        return com;
    }

    private static void assembled(String s, String digits) {
        if(digits.length()==0){
            com.add(s);
        }else{
            String key = digits.substring(0, 1);
            String s1 = phone.get(key);

            for(int i = 0;i<s1.length();i++){
                String substring = s1.substring(i, i + 1);

                assembled(s+substring,digits.substring(1));
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = letterCombinations("23");

        for (String s : list) {
            System.out.print(s+" ");
        }
    }
}
