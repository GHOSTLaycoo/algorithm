package com.xi2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/16 0016 - 上午 9:39
 */
public class NOWCODER_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        in.close();

        System.out.println(a.divideAndRemainder(b)[0]+" "+a.divideAndRemainder(b)[1]);
    }
}
