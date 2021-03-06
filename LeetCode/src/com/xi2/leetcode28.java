package com.xi2;

import java.util.Date;

/**
 * @author GHOSTLaycoo
 * @date 2020/1/9 0009 - 上午 9:15
 *
 * 题目:实现 strStr()
 *
 * 实现 strStr() 函数。

给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:

输入: haystack = "hello", needle = "ll"
输出: 2
示例 2:

输入: haystack = "aaaaa", needle = "bba"
输出: -1

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/implement-strstr
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode28 {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        int i = strStr("mississippi", "issip");
        System.out.println(i);
        Date a = new Date();
        System.out.println(a);
    }
}
