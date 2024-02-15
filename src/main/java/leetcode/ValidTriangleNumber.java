package leetcode;

import java.util.Arrays;

public class ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        for (int i = nums.length - 1; i > -1; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] <= nums[i]) left++;
                counter += right - left;
                right--;
            }
        }
        return counter;
    }// 1 2 3 4 5 6 6 7 8 9 10
    //        4       7     10
}
