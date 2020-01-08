package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/3 0003 - 下午 14:57
 *
 * 题目：变态跳台子
 */
public class Q_9 {
    public static int JumpFloorII(int target) {
        if(target<1){
            return 0;
        }else if(target==1){
            return 1;
        }
        return JumpFloorII(target-1)*2;
    }

    public static void main(String[] args) {
        int i = JumpFloorII(4);
        System.out.println(i);
        System.out.println();
    }
}
