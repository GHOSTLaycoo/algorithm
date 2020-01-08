package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/9 0009 - 下午 14:24
 *
 * 题目:有几个PAT
 */
public class NOWCODER_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        char[] a = {'P','A','T'};

        int j=0;
        Long P = 0L;
        Long PA = 0L;
        Long PAT = 0L;
            for(;j<s.length();j++){
                if(a[0]==s.charAt(j)){
                    P++;
                }

                if(a[1]==s.charAt(j)){
                    PA+=P;
                }

                if(a[2]==s.charAt(j)){
                    PAT+=PA;
                }
            }
        System.out.println(PAT%1000000007);
    }
}
