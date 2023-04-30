package leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2 || n == 3) return n;

        int prev1 = 1;
        int prev2 = 1;

        for (int i = 2; i <= n; ++i) {
            int dp = prev1 + prev2;
            prev2 = prev1;
            prev1 = dp;
        }
        return prev1;
    }
}
