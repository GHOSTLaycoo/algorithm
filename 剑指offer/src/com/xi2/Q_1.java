package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/15 0015 - 下午 15:10
 *
 * 题目:二维数组中的查找
 */
public class Q_1 {
    public boolean Find(int target, int [][] array) {
        int i=array.length-1;
        int j=0;
        while(i>=0&&j<=array[0].length-1){

            if(array[i][j]>target){
                i--;
            }else if(array[i][j]<target){
                j++;
            }else return true;

        }
        return false;
    }
}
