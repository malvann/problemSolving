package leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;

        int nextPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[nextPos++] = nums[i];
        }
        while (nextPos < nums.length){
            nums[nextPos++] = 0;
        }
    }
}
