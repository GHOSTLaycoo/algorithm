package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/15 0015 - 上午 11:42
 *
 * 题目：1016. 部分A+B (15)
 */
public class NOWCODER_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        int str2 = in.nextInt();
        String str3 = in.next();
        int str4 = in.nextInt();
        in.close();

        int a = 0;
        int b = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(str2 == str1.charAt(i)-'0'){
                a = a*10+str2;
            }
        }

        for (int i = 0; i < str3.length(); i++) {
            if(str4 == str3.charAt(i)-'0'){
                b = b*10+str4;
            }
        }

        System.out.println(a+b);

    }
}
