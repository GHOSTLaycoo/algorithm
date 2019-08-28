package com.xi2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/27 0027 - 上午 11:30
 */
public class NOWCODER_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int need = in.nextInt();
        int[] have = new int[num];
        double[] price = new double[num];
        double[] PJ = new double[num];

        Map<Double,Integer> map = new HashMap<>();
        for(int i=0;i<num;i++){
            have[i] = in.nextInt();
        }
        for(int i=0;i<num;i++){
            price[i] = in.nextInt();
            PJ[i] =price[i]/have[i];
            map.put(PJ[i],have[i]);
        }

        Arrays.sort(PJ);
        double money = 0.00;
        int a = num-1;
        if(need<=map.get(PJ[a])){
            money = need*PJ[a];
        }
        while(need>0||a>=0){
                if((need-map.get(PJ[a]))>0){
                    money+=map.get(PJ[a])*PJ[a];
                    need = need-map.get(PJ[a]);
                    a--;
                }else if((need-map.get(PJ[a]))<=0){
                    money += need * PJ[a];
                    a--;
                    break;
                }
        }
        System.out.println(String.format("%.2f",money));
    }
}
