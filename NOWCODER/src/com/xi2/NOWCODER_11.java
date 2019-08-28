package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/20 0020 - 上午 11:07
 *
 * 题目：跟奥巴马一起编程(15)
 */
public class NOWCODER_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String str = in.next();
        in.close();

        for(int i = 0;i<a;i++){
            System.out.print(str);
        }
        System.out.println("");
        int b = ((a+1)/2)-2;
        for(int i=0;i<b;i++){
            System.out.print(str);
            for(int j=0;j<a-2;j++){
                System.out.print(" ");
            }
            System.out.println(str);
        }
        for(int i = 0;i<a;i++){
            System.out.print(str);
        }
    }
}
