package BST;

import java.util.Scanner;

/**
 * @author GHOSTLaycoo
 * @date 2019/10/23 0023 - 下午 23:17
 */
public class B2 {
        public static void main(String args[]) {
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            int coins[]= {1,2,5,10};
            int [] dp=new int[100001];
            dp[0]=1;
            for(int i=0;i<4;i++) {
                for(int j=coins[i];j<=n;j++) {
                    dp[j]=(dp[j]+dp[j-coins[i]])%1000000007;
                }
            }
            System.out.println(dp[n]);
        }
}
