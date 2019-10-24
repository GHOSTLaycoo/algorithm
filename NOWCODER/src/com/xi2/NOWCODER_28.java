package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/9 0009 - 下午 12:35
 *
 * 题目:旧键盘打字(20)
 */
public class NOWCODER_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();

        boolean flag = false;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='+'){
                flag = true;
            }
        }

        StringBuffer bt = new StringBuffer(b);
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)=='+'){
                continue;
            }
            for(int j = 0;j<bt.length();j++){
                if(flag&&(65<=bt.charAt(j)&&bt.charAt(j)<=90)){
                    bt.deleteCharAt(j);
                    j--;
                    continue;
                }
                if((97<=bt.charAt(j)&&bt.charAt(j)<=122)){
                    if(a.charAt(i)==bt.charAt(j)-32){
                        bt.deleteCharAt(j);
                        j--;
                    }
                }else{
                    if(a.charAt(i)==bt.charAt(j)){
                        bt.deleteCharAt(j);
                        j--;
                    }
                }
            }
        }
        if(bt.length()==0){
            System.out.println("_");
        }else{
            System.out.println(bt);
        }
    }
}
