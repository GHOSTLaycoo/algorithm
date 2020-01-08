package com.xi2;

import java.util.Arrays;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/3 0003 - 上午 11:49
 *
 * 题目:寻找两个有序数组的中位数
 */
public class leetcode4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int[] num = new int[len];
        System.arraycopy(nums1,0,num,0,nums1.length);
        System.arraycopy(nums2,0,num,nums1.length,nums2.length);
        Arrays.sort(num);
        if(len%2!=0){
            return num[len/2]*1.0;
        }else{
            return (num[len/2]+num[len/2-1])/2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}
