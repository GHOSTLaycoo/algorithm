package com.xi2;

import java.util.*;

/**
 * @author GHOSTLaycoo
 * @date 2019/12/11 0011 - 上午 10:50
 *
 * 题目:糖果谜题
 */
public class NOWCODER_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        sc.close();

        String[] split = next.split(" ");
        int length = split.length;

        Set<String> set = new HashSet<>(Arrays.asList(split));

        if(set.size()==1) {
            Iterator<String> iterator = set.iterator();
            String next1 = iterator.next();
            int i = Integer.parseInt(next1);
            if (i > 0) {
                int yi = i + 1;
                int i1 = length / yi;
                int i2 = length % yi;
                if (i2 != 0) {
                    int i3 = (i1 + 1) * yi;
                    System.out.println(i3);
                }
                } else {
                    System.out.println(length);
                }
            } else {
                int num = set.stream().mapToInt(n -> (Integer.parseInt(n) + 1)).sum();
                System.out.println(num);
            }



    }
}
