package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/9/9 0009 - 上午 11:28
 */
public class Test {

    public static void main(String[] args) {
        String s = "adefgfeda";
        int fun = fun(s);
        System.out.println(fun);
    }

    private static int fun(String s) {
        int left = 0;
        int right = s.length()-1;
        for(int i =0;i<s.length()/2;i++){
            if(s.charAt(left)!=s.charAt(right)){
                return 0;
            }else{
                left++;
                right--;
            }
        }
        return 1;
    }


}
