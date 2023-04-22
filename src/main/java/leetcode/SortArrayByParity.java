package leetcode;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        if (nums == null) return null;

        int index = nums.length - 1;
        for (int i = 0; i < index; i++) {
            if ((nums[i] & 1) != 0) {
                if ((nums[index] & 1) != 0 && --index == i) return nums;

                int buf = nums[index];
                nums[index--] = nums[i];
                nums[i] = buf;
            }
        }
        return nums;
    }
}