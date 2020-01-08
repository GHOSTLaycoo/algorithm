package com.xi2;

import java.util.Arrays;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/10 0010 - 下午 13:43
 *
 * 题目:最接近的三数之和
 */
public class leetcode16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0]+nums[1]+nums[2];
        for(int i = 0;i<nums.length;i++){
            int l = i+1;
            int r = nums.length-1;

            while(l<r){
                int num = nums[i] + nums[l] + nums[r];
                if(Math.abs(target-num)<Math.abs(target-ans)){
                    ans = num;
                }

                if(num<target){
                    l++;
                }else if(num>target){
                    r--;
                }else{
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int i = threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        System.out.println(i);
    }
}
