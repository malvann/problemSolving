package leetcode;

import java.util.Arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return search(nums, target, 0);
    }

    private int search(int[] nums, int target, int startInd) {
        if (nums.length == 0) return -1;
        int midInd = nums.length / 2;
        int num = nums[midInd];
        if (num == target) return midInd + startInd;
        return target < num
                ? search(Arrays.copyOfRange(nums, 0, midInd), target, startInd)
                : search(Arrays.copyOfRange(nums, midInd + 1, nums.length), target, startInd + midInd + 1);
    }
}
