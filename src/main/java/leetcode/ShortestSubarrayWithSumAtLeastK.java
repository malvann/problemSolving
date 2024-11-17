package leetcode;

import java.util.Arrays;

public class ShortestSubarrayWithSumAtLeastK {
    public int shortestSubarray(int[] nums, int k) {
        if (Arrays.stream(nums).anyMatch(n -> n >= k)) return 1;

        int sum;
        int shortestLength = -1;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            int j = i;
            while (++j < nums.length) {
                sum += nums[j];
                if (sum >= k) {
                    if (j - i + 1 == 2) return 2;
                    shortestLength = shortestLength == -1 ? j - i + 1 : Math.min(shortestLength, j - i + 1);
                    break;
                }
            }
        }

        return shortestLength;
    }
}
