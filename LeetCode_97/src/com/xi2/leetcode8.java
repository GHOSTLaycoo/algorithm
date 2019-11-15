package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/11/14 0014 - 下午 14:30
 *
 * 题目:字符串转换整数 (atoi)
 */
public class leetcode8 {
    public static int myAtoi(String str) {
        if(str.length()<=0){
            return 0;
        }
        if(str.charAt(0)==' '||str.charAt(0)=='-'||str.charAt(0)=='+'||(str.charAt(0)>=48&&str.charAt(0)<=57)){

        }else{
            return 0;
        }
        int start = 0;
        int end = 0;
        boolean flag = false;
        boolean flag1 = false;
        stop:for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            if(str.charAt(i)=='-'){
                flag = true;
            }
            if(str.charAt(i)=='+'){
                flag1 = true;
            }


            if(flag||flag1){
                if(str.length()-1>i+1){
                    if((str.charAt(i+1)<48||str.charAt(i+1)>57)){
                        return 0;
                    }
                }
                if(str.length()==1){
                    return 0;
                }
                i+=1;
            }

            if(str.charAt(i)>=48&&str.charAt(i)<=57){
                start = i;
                for(int j = i;j<str.length();j++){
                    if(str.charAt(j)>=48&&str.charAt(j)<=57){
                        end = j;
                        continue ;
                    }
                    break stop;
                }
                break;
            }else{
                return 0;
            }
        }

        if(flag1&&flag){
            return 0;
        }

        if(start==0&&end==0&&(str.charAt(start)<48||str.charAt(start)>57)){
            return 0;
        }
        String substring;
        if(flag){

            substring = str.substring(start - 1, end+1);
        }else {
            substring = str.substring(start,end+1);
        }

        if(Double.parseDouble(substring)>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(Double.parseDouble(substring)<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(substring);
    }

    public static void main(String[] args) {
        int i = myAtoi(" b11228552307");
        System.out.println(i);
    }
}
