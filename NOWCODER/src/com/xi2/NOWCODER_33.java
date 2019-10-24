package com.xi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/21 0021 - 下午 18:28
 */
public class NOWCODER_33 {

    private static int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        sc.close();

        int[] as = change(a);
        int[] bs = change(b);
        int[] cs = change(c);

        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0;i<as[0];i++){
            lists.add(new ArrayList<>());
        }

        for(int i=0;i<as[1];i++){

        }

    }


    public static int[] change(String strs){
        int[] ints = new int[strs.length()];
        for(int i=0;i<strs.length();i++){
            ints[i] = strs.charAt(i)-'0';
        }
        return ints;
    }

    public static int Min(List<List<Integer>> lists){
        for (List<Integer> list : lists) {

        }
        return 1;
    }


}
