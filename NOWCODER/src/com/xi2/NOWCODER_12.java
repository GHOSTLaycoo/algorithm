package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/20 0020 - 下午 17:52
 *
 * 题目：统计同成绩学生(20)
 */
public class NOWCODER_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[in.nextInt()];

        for(int i=0;i<a.length;i++){
            a[i] = in.nextInt();
        }
        int[] b = new int[in.nextInt()];
        for(int i=0;i<b.length;i++){
            b[i] = in.nextInt();
        }

        in.close();

        int num = 0;
        for(int i=0;i<b.length;i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    num++;
                }
            }
            System.out.print(num);
            if(i<b.length-1){
                System.out.print(" ");
            }
            num = 0;
        }
    }
}
