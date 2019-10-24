package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/8 0008 - 下午 16:09
 *
 * 题目:福尔摩斯的约会 (20)
 */
public class NOWCODER_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        sc.close();

        String[] s = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        boolean flag = true;

        for(int i=0;i<(s1.length()<s2.length()?s1.length():s2.length());i++){
            if(flag){
                if(s1.charAt(i)==s2.charAt(i)&&(65<=s1.charAt(i)&&s1.charAt(i)<=90)){
                    System.out.print(s[s1.charAt(i)-'A']+" ");
                    flag = false;
                }
            }else{
                if(s1.charAt(i)==s2.charAt(i)&&(48<=s1.charAt(i)&&s1.charAt(i)<=57)){
                    System.out.print("0"+s1.charAt(i)+":");
                    break;
                }else if(s1.charAt(i)==s2.charAt(i)&&(65<=s1.charAt(i)&&s1.charAt(i)<=78)){
                    System.out.print((s1.charAt(i)-'A')+10+":");
                    break;
                }
            }
        }

        for(int i=0;i<(s3.length()<s4.length()?s3.length():s4.length());i++){
                if(s3.charAt(i)==s4.charAt(i)){
                    if((65<=s3.charAt(i)&&s3.charAt(i)<=90)||(97<=s3.charAt(i)&&s3.charAt(i)<=122)){
                        if(i<10){
                            System.out.print("0"+i);
                            break;
                        }else if(i<60){
                            System.out.print(i);
                            break;
                        }
                    }
                }
        }
    }
}
