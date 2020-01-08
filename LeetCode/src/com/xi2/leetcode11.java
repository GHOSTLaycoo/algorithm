package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/22 0022 - 上午 10:32
 *
 * 题目:盛最多水的容器
 */
public class leetcode11 {
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;

        while(l<r){
            if(height[l]<height[r]){
                max = Math.max(max,(r-l)*height[l]);
                l++;
            }else{
                max = Math.max(max,(r-l)*height[r]);
                r--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int i = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(i);
    }
}
