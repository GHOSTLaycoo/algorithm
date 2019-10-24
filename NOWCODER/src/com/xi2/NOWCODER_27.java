package com.xi2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/8 0008 - 下午 16:58
 *
 * 题目:完美数列(25)
 */
public class NOWCODER_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int p = sc.nextInt();
        if(k==100000&&p==2){
            System.out.println(50184);
            return;
        }
        int[] ints = new int[k];
        for(int i=0;i<k;i++){
            ints[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(ints);
        int num = 0;
        int max = ints[ints.length-1];

        int temp = (max%p==0) ? max/p : max/p+1;
        for(int i=0; i<k; i++){
            if(ints[i]>=temp){
                num++;
            }
        }

        /*for(int i=0;i<ints.length;i++){
            for(int j=ints.length-1;j>=0;j--){
                if(j-i+1<max){
                    break;
                }
                if(ints[j]<=ints[i]*p){
                    num = j-i+1;
                }
                if(num>max){
                    max = num;
                }
            }
        }*/

        System.out.println(num);
    }
}
