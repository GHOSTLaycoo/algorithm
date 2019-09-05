package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/31 0031 - 下午 17:41
 *
 * 题目:查验身份证(15)
 */
public class NOWCODER_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        String[] str = new String[row];
        for(int i=0;i<row;i++){
            str[i]=in.next();
        }
        in.close();
        int[] weight = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char[] charm = {'1','0','X','9','8','7','6','5','4','3','2'};
        boolean flag = false;
        boolean f = true;
        for(int i=0;i<row;i++){
            char[] chars = str[i].toCharArray();

            for(int j = 0;j<17;j++){
                if(chars[j]<'0'||chars[j]>'9'){
                    System.out.println(str[i]);
                    flag = true;
                    f = false;
                    break;
                }
            }

            if(flag){
                flag = false;
                continue;
            }

            int num = 0;
            for(int k = 0;k<weight.length;k++){
                num += (chars[k]-'0')*weight[k];
            }

            num = num%11;
            if(charm[num]!=chars[17]){
                System.out.println(str[i]);
                f = false;
            }
        }

        if(f){
            System.out.println("All passed");
        }

    }
}
