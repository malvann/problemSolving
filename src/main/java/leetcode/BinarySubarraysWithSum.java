package leetcode;

public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++){
                sum += nums[j];
                if (sum > goal) break;
                if (sum == goal) counter++;
            }
        }
        return counter;
    }
}
