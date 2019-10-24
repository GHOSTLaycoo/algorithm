package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/2 0002 - 下午 22:47
 *
 * 题目:去除重复数
 */
public class Q_2 {
    public static void main(String[] args) {
        int[] ints = {2,3,1,0,2,5,3};

        for(int i = 0;i<ints.length;i++){
            for(int j = i+1;j<ints.length;j++){
                if(ints[i] == ints[j]){
                    System.out.println(ints[i]);
                    break;
                }
            }
        }
    }
}
