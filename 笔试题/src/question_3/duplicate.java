package question_3;

import java.util.Arrays;

/**
 * 数组中重复的数字
 * @author GHOSTLaycoo
 * @date 2020/1/15 0015 - 下午 21:39
 */
public class duplicate {
    public static Integer duplicateTest(int[] nums){
        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i++){
            if((i+1)>nums.length){
                return null;
            }

            if(nums[i]==nums[i+1]){
                return nums[i+1];
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Integer integer = duplicateTest(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println(integer);
    }
}
