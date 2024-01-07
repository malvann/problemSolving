package leetcode;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int counter = 0;
        int[] dp = new int[nums.length];

        for (int i = 1; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
                counter = Math.max(counter, dp[i]);
            }
        }

        return counter + 1;
    }
}
