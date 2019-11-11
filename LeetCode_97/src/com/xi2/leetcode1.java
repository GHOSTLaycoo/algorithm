package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/26 0026 - 下午 20:17
 *
 * 题目:两数之和
 */
public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}
