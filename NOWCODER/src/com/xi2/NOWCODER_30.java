package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/9 0009 - 下午 14:01
 *
 * 题目:在霍格沃茨找零钱（20）
 */
public class NOWCODER_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] a = s.split(" ");
        String[] inta = a[0].split("\\.");
        String[] intb = a[1].split("\\.");

        int numa = Integer.parseInt(inta[0])*17*29+Integer.parseInt(inta[1])*29+Integer.parseInt(inta[2]);
        int numb = Integer.parseInt(intb[0])*17*29+Integer.parseInt(intb[1])*29+Integer.parseInt(intb[2]);

        int num = numb-numa;

        int G = Math.abs(num/(17*29));
        int S = Math.abs(num%(17*29)/29);
        int K = Math.abs(num%(17*29)%29);

        if(num<0){
            System.out.println("-"+G+"."+S+"."+K);
        }else{
            System.out.println(G+"."+S+"."+K);
        }


    }
}
