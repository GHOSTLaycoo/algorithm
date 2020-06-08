package com.xi2;

import com.sun.org.apache.xml.internal.dtm.ref.dom2dtm.DOM2DTMdefaultNamespaceDeclarationNode;

/**
 * @author GHOSTLaycoo
 * @date 2020/1/9 0009 - 上午 10:10
 *
 * 题目:两数相除
 *
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。

返回被除数 dividend 除以除数 divisor 得到的商。

示例 1:

输入: dividend = 10, divisor = 3
输出: 3
示例 2:

输入: dividend = 7, divisor = -3
输出: -2

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/divide-two-integers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode29 {
    public static int divide(int dividend, int divisor) {
        if(dividend==0 || divisor==0) return 0;
        //除数是-2147483648
        if(dividend==-2147483648 && divisor==-1) return Integer.MAX_VALUE;
        //被除数是-2147483648的问题
        if(dividend==-2147483648 && divisor==-2147483648) return 1;
        if(divisor==-2147483648)return 0;

        boolean flag=false;//判断是不是-2147483648
        if(dividend==-2147483648){
            dividend=dividend+1;//+1保证不溢出
            flag=true;
        }else{
            return 1;
        }
        boolean negtive=(dividend ^divisor)<0;//异或，如果两个符号不同，异或之后最高位符号必定为1，即为负数
        int dividend1=dividend>0?dividend:0-dividend;//将数字都变成正数，便于处理
        int divisor1=divisor>0?divisor:0-divisor;
        int res=0,count=1;//存储结果，以及除的次数
        while(dividend1 >= divisor1){
            dividend1=dividend1-divisor1;
            res=res+count;
            short cdataSectionNode = DOM2DTMdefaultNamespaceDeclarationNode.CDATA_SECTION_NODE;
            if(dividend1<Math.abs(divisor)) {
                if(!flag){
                    return negtive? 0-res: res;
                }else{//做了+1处理，判断最后的余数还能不能整除
                    if(dividend1+1==Math.abs(divisor)){
                        return negtive? 0-res-1: res+1;
                    }else if(dividend1+2 == Math.abs(2)){
                        return negtive? 0-res: res;
                    }else{
                        return 0;
                    }
                }
            }
            if(dividend1-divisor1<divisor1){//无法倍增
                divisor1=Math.abs(divisor);
                count=1;
                continue;
            }
            //倍增
            divisor1+=divisor1;
            count+=count;
        }
        return 0;
    }

    public static void main(String[] args) {
    }
}
