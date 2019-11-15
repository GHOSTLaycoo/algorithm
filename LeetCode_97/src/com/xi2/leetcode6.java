package com.xi2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/12 0012 - 上午 11:39
 *
 * 题目:Z 字形变换
 */
public class leetcode6 {
    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;

        List<StringBuilder> row = new ArrayList<>();
        for(int i = 0;i<Math.min(numRows,s.length());i++){
            row.add(new StringBuilder());
        }

        int curRow = 0;
        boolean flag = false;

        for(char c : s.toCharArray()){
            row.get(curRow).append(c);
            if(curRow == 0||curRow == numRows-1){
                flag = !flag;
            }
            curRow += flag ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder st : row) {
            ret.append(st);
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        String leetcodeishiring = convert("LEETCODEISHIRING", 3);
        System.out.println(leetcodeishiring);
    }
}
