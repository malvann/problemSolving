package leetcode;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
//        return IntStream.of(nums).parallel().map(num -> num * num).sorted().toArray();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
