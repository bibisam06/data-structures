package org.bibisam06.dp.basic;
/*
    Dynamic Programming 1 : 피보나치
*/
public class DpBasic1 {

    static long[] memo;
    public static void main(String[] args){
        int n = 50;
        memo = new long[n+1];
        for (int i=0;i<=n;i++) memo[i] = -1;
        System.out.println("TopDown fib(50): " + fibTopDown(50));
        System.out.println("BottomUp fib(50): " + fibBottomUp(50));

    }

    static long fibTopDown(int n){
        if (n <= 1) return n;                  // 기저조건 (0 또는 1이면 그대로 리턴)
        if (memo[n] != -1) return memo[n];     // 이미 계산한 값이 있으면 재사용
        return memo[n] = fibTopDown(n-1) + fibTopDown(n-2);  // 계산 후 저장
    }

    static long fibBottomUp(int n){
        if(n <= 1) return n;
        long[] dp = new long[n+1];
        dp[0] = 0; dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

}
