package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/3 0003 - 下午 15:25
 *
 * 题目：矩形覆盖
 */
public class Q_10 {
    public static int RectCover(int target) {
        if(target>2){
            return RectCover(target-1)+RectCover(target-2);
        }else if(target==2){
            return 2;
        }else if(target==1){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int i = RectCover(4);
        System.out.println(i);
    }
}
