package leetcode;

public class PartitionArraySuchThatMaximumDifferenceIsK {
    public int partitionArray(int[] nums, int k) {
        if (nums.length == 1) return 1;

        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) > k) {
                result++;
                continue;
            }

        }
        return result;
    }
}
