package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/14 0014 - 下午 15:04
 *
 * 题目：组个最小数 (20)
 */
public class NOWCODER_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        in.close();

        for(int i=1;i<num.length;i++){
            if(num[i]!=0){
                System.out.print(i);
                num[i]--;
                break;
            }
        }

        for(int i=0;i<num.length;i++){
            if(num[i]!=0){
                while(num[i]>0){
                    System.out.print(i);
                    num[i]--;
                }
            }
        }
    }
}
