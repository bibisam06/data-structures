package org.bibisam06.dp.basic;
/*
    Dynamic Programming 2 : 계단 오르기
*/
public class DpBasic2 {
    public static void main(String[] args){
        int[] score = {0, 10, 20, 15, 25, 10, 20}; // index 1~6 사용
        int n = 6;

        int[] dp = new int[n + 1];
        dp[1] = score[1];
        dp[2] = score[1] + score[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + score[i - 1]) + score[i];
        }

        System.out.println("최댓값: " + dp[n]); // 출력: 75

    }

}
