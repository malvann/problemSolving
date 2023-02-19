package leetcode;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (res[0] == -1) res[0] = i;
                if (i == nums.length - 1) res[1] = i;
                else if (nums[i] != nums[i + 1]) {
                    res[1] = i;
                    return res;
                }
            }
        }
        return res;
    }
}
