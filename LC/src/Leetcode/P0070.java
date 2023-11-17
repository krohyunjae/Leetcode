package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class P0070 {
    /**
     * You are climbing a staircase. It takes n steps to reach the top.
     *
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     */
    private Map<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        if(n <= 2) return n;
        if(memo.containsKey(n)) return memo.get(n);
        int result = climbStairs(n-1) + climbStairs(n-2);
        memo.put(n, result);
        return result;
    }

    public int climbStairsBottomUp(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
