package question_3;

/**
 * 不修改数组找出重复数字
 * @author GHOSTLaycoo
 * @date 2020/1/15 0015 - 下午 22:10
 */
public class getDuplication {
    public static Integer getDuplicationTest(int[] nums){
        for(int i = 0;i<nums.length;i++){
            boolean traverse = traverse(i, nums);
            if(traverse){
                return nums[i];
            }
        }
        return null;
    }

    private static boolean traverse(int i, int[] nums) {
        for(int j=i;j<nums.length;j++){
            if(nums[j]==nums[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer duplicationTest = getDuplicationTest(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println(duplicationTest);
    }
}
