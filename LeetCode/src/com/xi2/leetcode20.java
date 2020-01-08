package com.xi2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/12 0012 - 上午 9:52
 *
 * 题目:有效的括号
 */
public class leetcode20 {
    public static boolean isValid(String s) {
        Stack<Character> objects = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');

        for(int i=0;i<s.length();i++){
            if(!objects.isEmpty()){
                Character peek = objects.peek();
                Character character = map.get(peek);
                if(character!=null){
                    if(!character.equals(s.charAt(i))){
                        objects.push(s.charAt(i));
                    }else{
                        objects.pop();
                    }
                }
            }else{
                objects.push(s.charAt(i));
            }
        }

        if(objects.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean valid = isValid("()");
        System.out.println(valid);
    }
}
