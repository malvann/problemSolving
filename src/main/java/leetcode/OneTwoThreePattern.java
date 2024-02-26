package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class OneTwoThreePattern {
    //    i < j < k and nums[i] < nums[k] < nums[j]
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;

        int max = Integer.MIN_VALUE;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = nums.length - 1; i > -1; i--) {
            if (nums[i] < max) return true;
            while (!queue.isEmpty() && queue.peek() < nums[i]) {
                max = queue.poll();
            }
            queue.add(nums[i]);
        }
        return false;
    }
}
