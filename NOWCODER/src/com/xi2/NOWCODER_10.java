package com.xi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/20 0020 - 上午 9:31
 *
 * 题目：旧键盘 (20)
 */
public class NOWCODER_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        in.close();

        str1  = str1.toUpperCase();
        str2  = str2.toUpperCase();
        List<String> list = new ArrayList<>();
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)!=str2.charAt(j)){
                    boolean a = list.contains(String.valueOf(str1.charAt(i)));
                    if(a){
                        continue;
                    }else{
                        list.add(String.valueOf(str1.charAt(i)));
                    }
                }else{
                    boolean b = list.contains(String.valueOf(str1.charAt(i)));
                    if(b){
                        list.remove(String.valueOf(str1.charAt(i)));
                    }
                    break;
                }
            }
        }

        for(String s:list){
            System.out.print(s);
        }
    }
}
