package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/14 0014 - 下午 16:18
 *
 * 题目：个位数统计 (15)
 */
public class NOWCODER_3 {
        static int[] ll = new int[10];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        for(int i = 0;i<string.length();i++){
            ll[string.charAt(i)-48]++;
        }

        for(int i=0;i<10;i++){
            if(ll[i]!=0){
                System.out.println(i+":"+ ll[i]);
            }
        }
    }
}
