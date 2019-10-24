package com.xi2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/15 0015 - 上午 10:52
 *
 * 题目：阅读中文数字（25）
 */
public class NOWCODER_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();

        boolean flag = false;
        String[] s = {"Shi","Bai","Qian","Wan","Shi","Bai","Qian","Yi"};
        Map<Character,String> map = new HashMap<>();
        map.put('0',"ling");
        map.put('1',"yi");
        map.put('2',"er");
        map.put('3',"san");
        map.put('4',"si");
        map.put('5',"wu");
        map.put('6',"liu");
        map.put('7',"qi");
        map.put('8',"ba");
        map.put('9',"jiu");


        if(string.charAt(0)=='-'){
            System.out.print("Fu ");
            flag = true;
        }
        int b=0;
        StringBuilder ss = new StringBuilder();
        if(flag){
            ss.append(map.get(string.charAt(1))+" ");
            ss.append(s[string.length()-3]+" ");
            for(int i=2;i<string.length();i++){
                if(string.charAt(i)=='0'&&b>0){
                    if(i+1>=string.length()){
                        ss.delete(ss.indexOf("l"),ss.length()-1);
                        break;
                    }
                    continue;
                }
                if(string.charAt(i)!='0'){
                    ss.append(map.get(string.charAt(i))+" ");
                    if(i+1>=string.length()){
                        if(string.charAt(i)=='0'){
                            ss.delete(ss.indexOf("l"),ss.length()-1);
                        }
                        break;
                    }else {
                        ss.append(s[string.length()-i-2]+" ");
                        b=0;
                    }
                }else{
                    ss.append(map.get(string.charAt(i))+" ");
                    b++;
                    continue;
                }

            }
        }else {
            ss.append(map.get(string.charAt(0))+" ");
            ss.append(s[string.length()-2]+" ");
            for(int i=1;i<string.length();i++){
                if(string.charAt(i)=='0'&&b>0){
                    if(i+1>=string.length()){
                        ss.delete(ss.indexOf("l"),ss.length()-1);
                        break;
                    }
                    continue;
                }
                if(string.charAt(i)!='0'){
                    ss.append(map.get(string.charAt(i))+" ");
                    if(i+1>=string.length()){
                        if(string.charAt(i)=='0'){
                            ss.delete(ss.indexOf("l"),ss.length()-1);
                        }
                        break;
                    }else {
                        ss.append(s[string.length()-i-2]+" ");
                        b=0;
                    }
                }else{
                    ss.append(map.get(string.charAt(i))+" ");
                    b++;
                    continue;
                }
            }
        }

        System.out.println(ss);
    }
}
