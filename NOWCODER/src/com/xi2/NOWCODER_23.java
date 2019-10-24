package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/6 0006 - 下午 13:55
 */
public class NOWCODER_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int l = 0;
        int r = s.length()-1;
        boolean flag = false;
        boolean fla = false;
        int num = 0;
        int max = 0;

        for(int i=0;i<s.length();i++){
            r = s.length()-1;
            while(l<=r){
                if(s.charAt(l)==s.charAt(r)){
                    if(l==r){
                        flag = true;
                    }
                    l++;
                    r--;
                    num++;
                    continue;
                }
                num=0;
                l=i;
                r--;
            }
            if(num>max){
                max = num;
                l=i+1;
                fla = flag;
            }
            num=0;
            flag = false;
        }

        if(fla){
            System.out.println(2*max-1);
        }else{
            System.out.println(2*max);
        }

    }
}
