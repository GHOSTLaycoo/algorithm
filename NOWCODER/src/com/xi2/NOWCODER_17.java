package com.xi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/9/6 0006 - 上午 8:32
 *
 * 题目:A+B和C (15)
 */
public class NOWCODER_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        List<long[]> list = new ArrayList<>();


        for (int i=0;i<num;i++){
            long[] a = new long[3];
            for(int j=0;j<3;j++){
                a[j] = in.nextLong();
                if(a[j]<Integer.MIN_VALUE&&a[j]>Integer.MAX_VALUE){
                    a[j] = 0;
                }
            }
            list.add(a);
        }

        long b = 0;
        for(int i=0;i<num;i++){
           b =  list.get(i)[0]+list.get(i)[1];
           if(b>list.get(i)[2]){
               System.out.println("Case #"+(i+1)+": true");
           }else{
               System.out.println("Case #"+(i+1)+": false");
           }
        }



    }
}
