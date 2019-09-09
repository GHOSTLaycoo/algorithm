package com.xi2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/9/8 0008 - 上午 10:47
 *
 * 题目:	1019. 数字黑洞 (20)
 */
public class NOWCODER_19 {

    private static int x;
    private static int y;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        in.close();

        char[] ints = ccc(a);
        method(ints);

        if(a.length()!=4){
            String b = a;
            for(int i=0;i<4-a.length();i++){
                b += "0";
            }
            ints = ccc(b);
            method(ints);
        }


        if(ints[0]==ints[1]&&ints[1]==ints[2]&&ints[2]==ints[3]){
            System.out.println(a+" - "+a+" = "+"0000");
            return;
        }

        int num = 0;
        while(num!=6174){
            num = y-x;
            String cy = null;
            String cx = null;
            if(String.valueOf(y).length()!=4){
                cy = String.format("%0"+4+"d",y);
                cx = String.valueOf(x);
            }else if(String.valueOf(x).length()!=4){
                cx = String.format("%0"+4+"d",x);
                cy = String.valueOf(y);
            }else{
                cy = String.valueOf(y);
                cx = String.valueOf(x);
            }
            if(num==0){
                System.out.println(cy+" - "+cx+" = "+"0000");
            }else{
                System.out.println(cy+" - "+cx+" = "+num);
            }
            char[] is = ccc(String.valueOf(num));
            method(is);
        }
    }

    public static char[] ccc(String a){
        char[] chars = a.toCharArray();
        return chars;
    }

    public static void method(char[] ints){
        Arrays.sort(ints);
        x = Integer.parseInt(new String(ints));
        jinagxun(ints);
    }

    public static void jinagxun(char[] ints){
        char temp;
        for(int i = 0;i<ints.length;i++){
            for(int j = i;j<ints.length;j++){
                if(ints[i]<ints[j]){
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }

        y = Integer.parseInt(new String(ints));
    }

}
