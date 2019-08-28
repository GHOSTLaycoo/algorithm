package com.xi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/26 0026 - 下午 15:28
 *
 * 题目：锤子剪刀布 (20)
 */
public class NOWCODER_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        List<String[]> list = new ArrayList<>();
        for(int i=0;i<a;i++){
            String[] pro = new String[2];
            String J = in.next();
            String Y = in.next();
            pro[0] = J;
            pro[1] = Y;
            list.add(pro);
        }
        in.close();

        int JW = 0;
        int P = 0;
        List<String> jW = new ArrayList<>();
        List<String> yW = new ArrayList<>();
        for (String[] strings : list) {
            if("C".equals(strings[0])&&"J".equals(strings[1])){
                JW++;
                jW.add(strings[0]);
            }else if("J".equals(strings[0])&&"B".equals(strings[1])){
                JW++;
                jW.add(strings[0]);
            }else if("B".equals(strings[0])&&"C".equals(strings[1])){
                JW++;
                jW.add(strings[0]);
            }else if(("C".equals(strings[0])&&"C".equals(strings[1]))||("J".equals(strings[0])&&"J".equals(strings[1]))||("B".equals(strings[0])&&"B".equals(strings[1]))){
                P++;
            }else{
                yW.add(strings[1]);
            }
        }

        System.out.println(JW+" "+P+" "+(a-P-JW));
        System.out.println((a-P-JW)+" "+P+" "+JW);

        int C = 0;int J = 0;int B = 0;
        for (String s : jW) {
            if("C".equals(s)){
                C++;
            }else if("J".equals(s)){
                J++;
            }else{
                B++;
            }
        }
        panDuan(C, J, B);

        System.out.print(" ");

        C = 0;J = 0;B = 0;
        for (String s : yW) {
            if("C".equals(s)){
                C++;
            }else if("J".equals(s)){
                J++;
            }else{
                B++;
            }
        }
        panDuan(C, J, B);

        

    }

    private static void panDuan(int c, int j, int b) {
        if((b > c && b > j)|| (b == j&&b!=0) || (b == c&&b!=0)){
            System.out.print("B");
        }else if((c > b && c > j)|| (c == j&&c!=0)){
            System.out.print("C");
        }else if(j > b && j > c){
            System.out.print("J");
        }else{
            System.out.print("B");
        }
    }
}
