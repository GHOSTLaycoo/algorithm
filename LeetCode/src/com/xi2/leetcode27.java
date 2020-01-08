package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2020/1/8 0008 - 下午 15:02
 *
 * 题目:移除元素
 *
 *
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

示例 1:

给定 nums = [3,2,2,3], val = 3,

函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。

你不需要考虑数组中超出新长度后面的元素。
示例 2:

给定 nums = [0,1,2,2,3,0,4,2], val = 2,

函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。

注意这五个元素可为任意顺序。

你不需要考虑数组中超出新长度后面的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-element
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode27 {
    public int removeElement(int[] nums, int val) {
        int number = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]!=val){
                nums[i+1] = nums[i];
                nums[i+1] = nums[i+2];
            }
        }
        return ++number;
    }

    public static void main(String[] args) {
        int i = 2640 / 120;
        System.out.println(i);
    }
}
