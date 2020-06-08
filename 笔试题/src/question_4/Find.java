package question_4;

/**
 * 二维数组中的查找
 * @author GHOSTLaycoo
 * @date 2020/1/15 0015 - 下午 22:41
 */
public class Find {
    public static boolean FindTest(int[][] nums,int target){
        int i = 0;
        int j = nums[0].length-1;

        while(i<nums.length&&j>=0){
            if(target>nums[i][j]){
                i++;
            }else if(target<nums[i][j]){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean b = FindTest(nums, 9);
        System.out.println(b);
    }
}
