package com.xi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/9/6 0006 - 下午 17:51
 *
 * 题目:德才论 (25)
 */
public class NOWCODER_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int di = in.nextInt();
        int gao = in.nextInt();

        List<int[]> list = new ArrayList<>();


        for(int i=0;i<num;i++){
            int[] strings = new int[3];
            for(int j = 0;j<3;j++){
                strings[j] = in.nextInt();
            }
            list.add(strings);
        }
        in.close();

        List<int[]> A1 = new ArrayList<>();
        List<int[]> A2 = new ArrayList<>();
        List<int[]> A3 = new ArrayList<>();
        List<int[]> A4 = new ArrayList<>();
        for (int[] strings : list) {
            if(strings[1]<di||strings[2]<di){
                continue;
            }
            if(strings[1]>=gao&&strings[2]>=gao){
                A1.add(strings);
            }else if(strings[1]>=gao&&strings[2]<gao){
                A2.add(strings);
            }else if(strings[1]<gao&&strings[2]<gao&&strings[1]>strings[2]){
                A3.add(strings);
            }else{
                A4.add(strings);
            }
        }

        System.out.println(A1.size()+A2.size()+A3.size()+A4.size());
        Paixun(A1);
        Paixun(A2);
        Paixun(A3);
        Paixun(A4);
    }

    public static void Paixun(List<int[]> list){
        int[] l = null;
        for(int i = 0;i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                if((list.get(i)[1]+list.get(i)[2])<(list.get(j)[1]+list.get(j)[2])){
                    l = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,l);
                }else if((list.get(i)[1]+list.get(i)[2])==(list.get(j)[1]+list.get(j)[2])){
                    if(list.get(i)[1]<list.get(j)[1]){
                        l = list.get(i);
                        list.set(i,list.get(j));
                        list.set(j,l);
                    }else if(list.get(i)[1]==list.get(j)[1]){
                        if(list.get(i)[0]<list.get(j)[0]){
                            l = list.get(i);
                            list.set(i,list.get(j));
                            list.set(j,l);
                        }
                    }
                }
            }
        }

        for (int[] ints : list) {
            System.out.println(ints[0]+" "+ints[1]+" "+ints[2]);
        }
        
    }
}
