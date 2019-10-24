package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/8 0008 - 下午 14:29
 *
 * 题目:数字分类 (20)
 */
public class NOWCODER_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] ints = s.split(" ");

        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        float A4 = 0;
        float num = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        float c4 = 0;
        int c5 = 0;
        int A5 = 0;
        int k = 1;

        for(int i = 1;i<ints.length;i++){
            if(Integer.parseInt(ints[i])%5==0&&Integer.parseInt(ints[i])%2==0){
                A1+=Integer.parseInt(ints[i]);
                c1++;
            }

            if(Integer.parseInt(ints[i])%5==1){
                A2+= k*Integer.parseInt(ints[i]);
                k=k*(-1);
                c2++;
            }

            if(Integer.parseInt(ints[i])%5==2){
                A3++;
                c3++;
            }

            if(Integer.parseInt(ints[i])%5==3){
                num+=Integer.parseInt(ints[i]);
                c4++;
            }

            if(Integer.parseInt(ints[i])%5==4){
                if(Integer.parseInt(ints[i])>A5){
                    A5 = Integer.parseInt(ints[i]);
                }
                c5++;
            }

        }

        A4 = num/c4;


        if(c1==0) {
            System.out.print("N ");
        }else{
            System.out.print(A1+" ");
        }

        if(c2==0) {
            System.out.print("N ");
        }else{
            System.out.print(A2+" ");
        }

        if(c3==0) {
            System.out.print("N ");
        }else{
            System.out.print(A3+" ");
        }

        if(c4==0) {
            System.out.print("N ");
        }else{
            System.out.print(String.format("%.1f",A4)+" ");
        }

        if(c5==0) {
            System.out.print("N");
        }else{
            System.out.print(A5);
        }

    }


}
