package com.xi2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/21 0021 - 上午 9:48
 *
 * 题目：到底买不买（20）
 */
public class NOWCODER_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] str1 = in.nextLine().toCharArray();
        char[] str2 = in.nextLine().toCharArray();
        in.close();

        Arrays.sort(str1);
        Arrays.sort(str2);

        int n=0;
        int j=0;
        for(int i=0;i<str2.length;i++){
            for(;j<str1.length&&str1[j]<=str2[i];j++){
                if(str1[j]==str2[i]){
                    n++;
                    j++;
                    break;
                }
            }
        }

        if(n<str2.length){
            System.out.println("No "+(str2.length-n));
        }else{
            System.out.println("Yes "+(str1.length-str2.length));
        }

    }
}
