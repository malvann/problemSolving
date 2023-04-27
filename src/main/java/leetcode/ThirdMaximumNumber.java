package leetcode;

import java.util.Arrays;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        if (nums == null) return -1;

        Arrays.sort(nums);

        int counter = 2;
        for (int i = nums.length - 2; i > -1; i--) {
            if (nums[i + 1] != nums[i]) counter--;
            if (counter == 0) return nums[i];
        }
        return nums[nums.length - 1];
    }
}
