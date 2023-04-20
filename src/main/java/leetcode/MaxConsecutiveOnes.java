package leetcode;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;

        int counter = 0;
        int prev = 0;
        for (int num : nums) {
            if (num == 1) {
                if (prev == 1) counter++;
                else {
                    result = Math.max(result, counter);
                    counter = 1;
                }
            }
            prev = num;
        }

        return Math.max(result, counter);
    }
}
