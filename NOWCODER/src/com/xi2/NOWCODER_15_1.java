package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/28 0028 - 上午 11:01
 */
public class NOWCODER_15_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        int num = in.nextInt();
        double profit = 0.0;//最大收益
        int[] qua = new int[type];
        int[] price = new int[type];
        for(int i=0;i<type;i++){
            qua[i]=in.nextInt();
        }
        for(int i=0;i<type;i++){
            price[i]=in.nextInt();
        }
        double[] per = new double[type];
        for(int i=0;i<type;i++){
            per[i]=(double)price[i]/(double)qua[i];
        }
        //要用到排序
        for(int i=1;i<type;i++){
            int j=i;double key_per = per[i];
            int key_qua = qua[i];
            int key_price = price[i];
            while(j>0&&key_per>per[j-1]){
                per[j] = per[j-1];
                qua[j] = qua[j-1];
                price[j] = price[j-1];
                j--;
            }
            per[j]=key_per;
            qua[j]=key_qua;
            price[j]=key_price;
        }
        boolean flag = true;
        int temp =0;
        //int temp_num = num;
        //System.out.println("num "+num);
        while(flag){
            for(int i=0;i<type;i++){
                if(num>=qua[i]){
                    //System.out.println("qua["+i+"] "+qua[i]);
                    temp+=qua[i];
                    profit+=price[i];
                    num-=qua[i];
                }else if(num<qua[i]){
                    //System.out.println("qua["+i+"] "+qua[i]);
                    temp+=num;
                    profit+=num*per[i];
                    flag = false;
                    break;
                }
            }
        }
        //System.out.println(" ");
        System.out.println(String.format("%.2f",profit));
        /*DecimalFormat df = new DecimalFormat("###.00");
        System.out.println(df.format(profit));*/
    }
}
