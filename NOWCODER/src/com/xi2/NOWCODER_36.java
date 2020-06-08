package com.xi2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2020/1/20 0020 - 下午 14:35
 *
 *
 * 小米食堂每年都会举办一次厨艺大赛，假设参赛的厨师一共有n位（n < 1000），比赛结束后没有公布评分，
 * 但是站在领奖台上的一排厨师中每位厨师都能看到与自己相邻的厨师（左或者右）里评分比自己低
 * （看不到比自己分数高的人的分数）的评分。比赛结束之后要发奖金，以1K为单位，每位厨师至少会发1K的奖金，
 * 另外，如果一个厨师发现自己的奖金没有高于比自己评分低的厨师的奖金，就会不满意，作为比赛组织方，小米食
 * 堂至少需要发放多少奖金才能让所有厨师满意。
输入描述:
每组数据为n+1个正整数单空格分割，其中第一个数为参赛厨师的人数，后面n个数为每位厨师的得分（0-100）
输出描述:
输出至少需要多少K的奖金
示例1
输入
10 5 29 11 4 52 56 43 82 21 34
   1 2  1  1 2  3  1  2  1  2
输出
20
 */
public class NOWCODER_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] split = s.split(" ");
        Map<String,Integer> map = new HashMap<>();
        map.put(split[1],1);
        for(int i = 1;i<Integer.parseInt(split[0]);i++){
            if(Integer.parseInt(split[i+1])>Integer.parseInt(split[i])){
                map.put(split[i+1],map.get(split[i])+1);
            }else{
                map.put(split[i+1],1);
            }
        }

        for (int i=Integer.parseInt(split[0])-2;i>=1;i--){
            if(Integer.parseInt(split[i])>Integer.parseInt(split[i+1])&&map.get(split[i])<=map.get(split[i+1])){
                map.put(split[i],map.get(split[i-1])+1);
            }
        }


        int sum = 0;
        for (int i = 1; i < split.length; i++) {
            sum+=map.get(split[i]);
        }

        System.out.println(sum);
    }
}
