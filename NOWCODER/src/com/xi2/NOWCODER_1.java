package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/14 0014 - 上午 11:31
 *
 * 题目：D进制的A+B (20)
 */
public class NOWCODER_1 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int A = in.nextInt();
            int B = in.nextInt();
            int D = in.nextInt();
            in.close();
            int sum = A + B;
            StringBuffer string = new StringBuffer();
            while(sum != 0){
                int temp = sum % D;
                string.append(temp);
                sum /= D;
            }
            string.reverse();
            System.out.println(string);
    }
}
