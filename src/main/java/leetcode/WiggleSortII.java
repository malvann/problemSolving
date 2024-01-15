package leetcode;

import java.util.Arrays;

public class WiggleSortII {
    public void wiggleSort(int[] nums) {
        if (nums.length == 1) return;
        Arrays.sort(nums);

        for (int i = 1, j = nums.length / 2; j < nums.length - 1; i += 2, j++) {
            int buff = nums[i];
            nums[i] = nums[j];
            nums[j] = buff;
        }
    }
}
