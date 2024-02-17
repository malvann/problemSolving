package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            int size = set.size();
            set.add(n);
            if (size == set.size()) return n;
        }
        return 0;
    }

    public int findDuplicate1(int[] nums) {
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums[i - 1]) continue;

            int buf;
            while (nums[i - 1] != i) {
                if (nums[i - 1] == nums[nums[i - 1] - 1]) return nums[i - 1];
                buf = nums[nums[i - 1] - 1];
                nums[nums[i - 1] - 1] = nums[i - 1];
                nums[i - 1] = buf;
            }
        }
        return -1;
    }
}
