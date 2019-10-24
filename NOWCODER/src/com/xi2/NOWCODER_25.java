package com.xi2;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/8 0008 - 下午 15:31
 *
 * 题目:数素数 (20)
 */
public class NOWCODER_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int p = 2;
        int c = 1;
        int b = 0;
        while(c<=n){
            if(isPrime(p)){
                if(c>=m&&c<n){
                    System.out.print(p+" ");
                    b++;
                    if(b%10==0){
                        System.out.println("");
                    }
                }else if(c==n){
                    System.out.print(p);
                }

                c++;
            }
            p++;
        }


    }

    public static boolean isPrime(int num) {
        if (num <= 3) {
            return num > 1;
        }
        // 不在6的倍数两侧的一定不是质数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
