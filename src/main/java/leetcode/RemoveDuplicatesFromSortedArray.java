package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;

        int nextInsert = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) nums[nextInsert++] = nums[i];
        }

        return nextInsert;
    }
}