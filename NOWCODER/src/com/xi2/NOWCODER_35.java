package com.xi2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/12 0012 - 上午 8:59
 *
 * 题目:字符串相乘
 */
public class NOWCODER_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(sc.nextLine());
        BigInteger bigInteger1 = new BigInteger(sc.nextLine());
        sc.close();



        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
    }
}
