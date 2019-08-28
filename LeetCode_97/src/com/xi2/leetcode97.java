package com.xi2;

/**
 * @author GHOSTLaycoo
 * @date 2019/8/1 0001 - 下午 16:42
 */
public class leetcode97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) return false;
        Boolean[][] dp = new Boolean[s1.length()][s2.length()];
        return isInterleaveHelper(s1, 0, s2, 0, s3, 0, dp);
    }


    public boolean isInterleaveHelper(String s1, int i, String s2, int j, String s3, int k, Boolean[][] dp) {
        if (i == s1.length()) return s2.substring(j).equals(s3.substring(k));
        if (j == s2.length()) return s1.substring(i).equals(s3.substring(k));

        if (dp[i][j] != null) return dp[i][j];

        if (s1.charAt(i) != s3.charAt(k) && s2.charAt(j) != s3.charAt(k)){
            dp[i][j] = false;
        } else if(s1.charAt(i) == s3.charAt(k) && s2.charAt(j) != s3.charAt(k)){
            dp[i][j] = isInterleaveHelper(s1, i + 1, s2, j, s3, k + 1, dp);
        } else if (s1.charAt(i) != s3.charAt(k) && s2.charAt(j) == s3.charAt(k)){
            dp[i][j] = isInterleaveHelper(s1, i, s2, j + 1, s3, k + 1, dp);
        } else {
            dp[i][j] = isInterleaveHelper(s1, i  + 1, s2, j, s3, k + 1, dp) || isInterleaveHelper(s1, i, s2, j + 1, s3, k + 1, dp);
        }

        return dp[i][j];
    }

    public static void main(String[] args) {
        String s1="aabcc";
        String s2="dbbca";
        String s3="aadbbcbcac";

        leetcode97 leet = new leetcode97();
        boolean b = leet.isInterleave(s1,s2,s3);
        System.out.println(b);
    }
}
