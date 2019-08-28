package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/15 0015 - 上午 11:07
 *
 * 题目：程序运行时间(15)
 */
public class NOWCODER_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c1 = in.nextInt();
        int c2 = in.nextInt();
        in.close();

        double x = 100.0;
        int time = (int) Math.round((c2-c1)/x);

        int hour = time/3600;
        time %= 3600;
        int minute = time/60;
        time %= 60;
        int second = time;
        System.out.printf("%02d:%02d:%02d",hour,minute,second);
    }
}
