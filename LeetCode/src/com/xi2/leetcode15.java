package com.xi2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/2 0002 - 下午 17:11
 *
 * 题目:三数之和
 */
public class leetcode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;

        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l = i+1;
            int r = len-1;

            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    lists.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1]) l++;
                    while(l<r&&nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }else if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists);
    }

}
