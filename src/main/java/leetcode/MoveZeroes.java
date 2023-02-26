package leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int nextPos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (nextPos == -1) nextPos = i;
            } else {
                if (nextPos == -1) continue;
                nums[nextPos] = nums[i];
                nums[i] = 0;
                nextPos = nums[nextPos + 1] == 0 ? nextPos + 1 : -1;
            }
        }
    }
}
