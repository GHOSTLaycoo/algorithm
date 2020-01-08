package com.xi2;

import java.util.Arrays;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/3 0003 - 下午 14:17
 *
 * 题目：旋转数组的最小数字
 */
public class Q_6 {
    public static int minNumberInRotateArray(int [] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args) {
        int i = minNumberInRotateArray(new int[]{3, 4, 5, 1, 2});
        System.out.println(i);
    }
}
