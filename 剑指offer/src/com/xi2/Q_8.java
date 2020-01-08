package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/3 0003 - 下午 14:55
 *
 * 题目：跳台阶
 */
public class Q_8 {
    public static int JumpFloor(int target) {
        if(target<1){
            return 0;
        }else if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }

        return JumpFloor(target-1)+JumpFloor(target-2);
    }

    public static void main(String[] args) {
        int i = JumpFloor(5);
        System.out.println(i);
    }
}
