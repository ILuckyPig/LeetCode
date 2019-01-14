package com.lu;

/**
 * 动态规划
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * 解法：过程同斐波那契数列
 */
public class ClimbingStairs {
    private static int climb(int n) {
        if (n <= 0)
            return 0;
        int[] memo = new int[n + 1];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }
        return climbStairs(n, memo);
    }
    private static int climbStairs(int n, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }
        if (n <= 1) {
            memo[n] = 1;
        } else {
            memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(climb(2));
    }
}
