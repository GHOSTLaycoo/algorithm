package com.xi2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/9/10 0010 - 下午 13:56
 *
 * 题目:挖掘机技术哪家强(20)
 */
public class NOWCODER_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();

        Map<String,Integer> map = new HashMap<>();

        int MaxValue = 0;
        String MaxKey = null;
        for(int i=0;i<row;i++){
            String info = in.next();
            int score = in.nextInt();
            if(!map.containsKey(info)){
                map.put(info,score);
            }else{
                score+=map.get(info);
                map.put(info,score);
            }

            if(score>MaxValue){
                MaxKey = info;
                MaxValue = score;
            }
        }

        System.out.println(MaxKey+" "+MaxValue);

    }

}

