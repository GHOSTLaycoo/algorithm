package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/19 0019 - 下午 14:52
 *
 * 题目：打印沙漏(20)
 */
public class NOWCODER_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String str = in.next();
        in.close();

        int w = (int) Math.sqrt((t+1)/2);
        int q = 1;
        for(int i=0;i<w-1;i++){
            q+=2;
        }
        int x = q;
        for(int i=0;i<w;i++){
            createStar(x,q,str);
            x-=2;
        }

        int a = 1;
        for(int i=0;i<w-1;i++){
            a+=2;
            createStar(a,q,str);
        }

        System.out.println(t-2*w*w+1);
    }

    public static void createStar(int x, int q, String str){
        int a = (q-x)/2;
        if(x<q){
            for(int i=0;i<q;i++){
                if(i>=a&&i<a+x) {
                    System.out.print(str);
                    continue;
                }else{
                    System.out.print(" ");
                }
            }
        }else{
            for(int i=0;i<q;i++){
                System.out.print(str);
            }
        }
        System.out.println("");
    }
}
