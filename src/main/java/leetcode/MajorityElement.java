package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : nums) {
            countMap.computeIfPresent(num, (k, v) -> ++v);
            countMap.putIfAbsent(num, 1);
            if (countMap.containsKey(num) && countMap.get(num) == nums.length / 2 + 1) return num;
        }
        return 0;
    }
}
