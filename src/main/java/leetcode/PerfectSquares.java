package leetcode;

public class PerfectSquares {
    public int numSquares(int n) {
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                min = Math.min(min, nums[i - j * j]);
            }
            nums[i] = min + 1;
        }
        return nums[n];
    }
}
