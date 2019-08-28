package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/19 0019 - 上午 10:54
 *
 * 题目：科学计数法 (20)
 * 有bug  例如1.23644E+03   会输出23644   答案应该是1236.44
 */
public class NOWCODER_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();

        String sbu = str.substring(str.indexOf("E"));
        String sba = str.substring(1,str.indexOf("E"));
        String ab = sba.replaceAll("\\.","");

        String num = null;
        int a = Integer.parseInt(sbu.substring(2));
        if(sbu.charAt(1)=='-'){
            String b = String.format("%0"+(a+ab.length())+"d",Integer.parseInt(ab));
            StringBuffer sb = new StringBuffer(b);
            sb.insert(1,".");
            if(str.charAt(0)=='-'){
                sb.insert(0,"-");
            }
            num = sb.toString();
            System.out.println(num);
        }else{
            String r = str.substring(1,str.indexOf("E"));
            int rr = r.length()-r.indexOf(".")-1;
            int k = a-rr;
            StringBuffer ss = new StringBuffer(ab);
            for(int i=0;i<k;i++){
                ss.append("0");
            }
            if(str.charAt(0)=='-'){
                ss.insert(0,"-");
            }
            num = ss.toString();
            System.out.println(num);
        }

    }
}
