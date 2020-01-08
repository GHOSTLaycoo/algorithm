package com.xi2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/10 0010 - 下午 14:57
 *
 * 题目:四数之和
 */
public class leetcode18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int newTarget = target - nums[i];
            for(int j = i+1;j<nums.length;j++){
                //if(nums[j]>newTarget) break;
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                int l = j+1;
                int r = nums.length-1;

                while(l<r){
                    int sum = nums[j]+nums[l]+nums[r];
                    if(sum==newTarget){
                        lists.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while(l<r&&nums[l]==nums[l+1]) l++;
                        while(l<r&&nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    }else if(sum<newTarget){
                        l++;
                    }else if(sum>newTarget){
                        r--;
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = fourSum(new int[]{1,-2,-5,-4,-3,3,3,5},-11);

        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }
    }
}
