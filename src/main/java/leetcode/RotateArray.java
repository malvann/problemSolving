package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || k == 0) return;
        int n = nums.length - k;
        while (n < 0) {
            n += nums.length;
        }
        if (n == 0) return;

        IntStream s1 = Arrays.stream(Arrays.copyOfRange(nums, n, nums.length));
        IntStream s2 = Arrays.stream(Arrays.copyOfRange(nums, 0, n));
        int i = 0;
        for (int num : IntStream.concat(s1, s2).toArray()) {
            nums[i] = num;
            i++;
        }
    }
}
