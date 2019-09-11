package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/9/11 0011 - 下午 14:57
 *
 *题目:有理数四则运算(20)
 */
public class NOWCODER_22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();

        String[] intas = a.split("/");
        String[] intbs = b.split("/");

        int a1 = Integer.parseInt(intas[0]);
        int a2 = Integer.parseInt(intas[1]);
        int b1 = Integer.parseInt(intbs[0]);
        int b2 = Integer.parseInt(intbs[1]);

        add(a1,a2,b1,b2);
        remove(a1,a2,b1,b2);
        cheng(a1,a2,b1,b2);
        chu(a1,a2,b1,b2);


    }

    private static void add(int a1, int a2, int b1, int b2) {
        int x = a1*b2+a2*b1;
        int y = a2*b2;
        change(a1,a2);
        System.out.print(" + ");
        change(b1,b2);
        System.out.print(" = ");
        change(x,y);
        System.out.println("");

    }

    private static void remove(int a1, int a2, int b1, int b2){
        int x = a1*b2-a2*b1;
        int y = a2*b2;
        change(a1,a2);
        System.out.print(" - ");
        change(b1,b2);
        System.out.print(" = ");
        change(x,y);
        System.out.println("");

    }

    private static void cheng(int a1, int a2, int b1, int b2){
        int x = a1*b1;
        int y = a2*b2;
        change(a1,a2);
        System.out.print(" * ");
        change(b1,b2);
        System.out.print(" = ");
        change(x,y);
        System.out.println("");

    }

    private static void chu(int a1, int a2, int b1, int b2){
        int x = a1*b2;
        int y = a2*b1;
        if (y < 0) {
            x = (-1) * x;
            y = (-1) * y;
        }
        change(a1,a2);
        System.out.print(" / ");
        change(b1,b2);
        System.out.print(" = ");
        if(y==0){
            System.out.print("Inf");
        }else{
            change(x,y);
        }
        System.out.println("");
    }

    private static void change(int x, int y) {
        boolean T = false;
        if(x<0){
            T = true;
            x = x*(-1);
        }
        int c = Ggs(x,y);

        int Mx = x/c;
        int My = y/c;
        int zs = Mx/My;
        int fz = Mx%My;
        int fm = My;

        if(T){
            System.out.print("(-");
            if(zs==0){
                if(fz!=0){
                    System.out.print(fz+"/"+fm);
                }else{
                    System.out.print(0);
                }
            }else{
                System.out.print(zs);
                if(fz!=0){
                    System.out.print(" "+fz+"/"+fm);
                }
            }
            System.out.print(")");
        }else if(zs==0){
            if(fz!=0){
                System.out.print(fz+"/"+fm);
            }else{
                System.out.print(0);
            }
        }else{
            System.out.print(zs);
            if(fz!=0){
                System.out.print(" "+fz+"/"+fm);
            }
        }
    }

    private static int Ggs(int x, int y) {
        if(y==0){
            return x;
        }else{
            return Ggs(y,x%y);
        }
    }


}
