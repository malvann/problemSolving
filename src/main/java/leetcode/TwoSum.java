package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int rest = target - nums[i];
            if (numIndexMap.containsKey(rest)) return new int[]{numIndexMap.get(rest), i};
            numIndexMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
