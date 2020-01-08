package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/22 0022 - 上午 10:42
 *
 * 题目:整数转罗马数字
 *
 * 字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

输入: 3
输出: "III"
示例 2:

输入: 4
输出: "IV"
示例 3:

输入: 9
输出: "IX"
示例 4:

输入: 58
输出: "LVIII"
解释: L = 50, V = 5, III = 3.
示例 5:

输入: 1994
输出: "MCMXCIV"
解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class leetcode12 {
    public static String intToRoman(int num) {
        int[] ints = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strings = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res = "";

        for(int i = 0;i<13;i++){
            while(num>=ints[i]){
                num -= ints[i];
                res += strings[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = intToRoman(58);
        System.out.println(s);
    }
}
