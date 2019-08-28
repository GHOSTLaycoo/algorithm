package com.xi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/19 0019 - 下午 17:27
 */

class person{
    public String name;
    public String y;
    public String m;
    public String d;
}
public class NOWCODER_9 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(Integer.parseInt(in.nextLine()));
        person[] p = new person[Integer.parseInt(in.nextLine())];
        for(int i=0;i<p.length;i++){
            String a[] = in.nextLine().split("/| ");
            p[i]=new person();
            p[i].name = a[0];
            p[i].y = a[1];
            p[i].m = a[2];
            p[i].d = a[3];
        }

        List<person> a = new ArrayList<>();
        for(int i=0;i<p.length;i++) {
            if(Integer.parseInt(p[i].y)<2014&&Integer.parseInt(p[i].y)>1814) {
                a.add(p[i]);
            }
            if(Integer.parseInt(p[i].y)==2014) {
                if(Integer.parseInt(p[i].m)<9) {
                    a.add(p[i]);
                }
                if(Integer.parseInt(p[i].m)==9) {
                    if(Integer.parseInt(p[i].d)<=6) {
                        a.add(p[i]);
                    }
                }
            }
            if(Integer.parseInt(p[i].y)==1814) {
                if(Integer.parseInt(p[i].m)>9) {
                    a.add(p[i]);
                }
                if(Integer.parseInt(p[i].m)==9) {
                    if(Integer.parseInt(p[i].d)>=6) {
                        a.add(p[i]);
                    }
                }
            }
        }
        person max=a.get(0);
        person min=a.get(0);
        for(int i=1;i<a.size();i++) {
            if(Integer.parseInt(a.get(i).y)<Integer.parseInt(max.y)) {
                max=a.get(i);
            }
            if(Integer.parseInt(a.get(i).y)==Integer.parseInt(max.y)) {
                if(Integer.parseInt(a.get(i).m)<Integer.parseInt(max.m)) {
                    max=a.get(i);
                }
                if(Integer.parseInt(a.get(i).m)==Integer.parseInt(max.m)) {
                    if(Integer.parseInt(a.get(i).d)<Integer.parseInt(max.d)) {
                        max=a.get(i);
                    }
                }
            }
            if(Integer.parseInt(a.get(i).y)>Integer.parseInt(min.y)) {
                min=a.get(i);
            }
            if(Integer.parseInt(a.get(i).y)==Integer.parseInt(min.y)) {
                if(Integer.parseInt(a.get(i).m)>Integer.parseInt(min.m)) {
                    min=a.get(i);
                }
                if(Integer.parseInt(a.get(i).m)==Integer.parseInt(min.m)) {
                    if(Integer.parseInt(a.get(i).d)>Integer.parseInt(min.d)) {
                        min=a.get(i);
                    }
                }
            }
        }
        System.out.println(a.size()+" "+max.name+" "+min.name);

    }
}
