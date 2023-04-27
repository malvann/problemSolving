package leetcode;

public class MaxConsecutiveOnesII {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxAmount = 0;
        int correntAmount = 0;
        int counter = 0;
        for (int num : nums) {
            counter++;
            if (num == 0) {
                correntAmount = counter;
                counter = 0;
            }
            maxAmount = Math.max(maxAmount, counter + correntAmount);
        }
        return maxAmount;
    }
}
