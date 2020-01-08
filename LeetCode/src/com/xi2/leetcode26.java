package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2020/1/7 0007 - 下午 17:24
 *
 * 题目:删除排序数组中的重复项
 */
public class leetcode26 {
    public static int removeDuplicates(int[] nums) {
        /*int sum = 1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                sum++;
                nums[sum] = nums[i+1];
            }
        }*/
        int number = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]!=nums[number]){
                number++;
                nums[number] = nums[i];
            }
        }
        return ++number;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
}
