package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForeSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return List.of();

        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for (int i1 = 0; i1 < nums.length; i1++) {
            for (int i2 = i1 + 1; i2 < nums.length; i2++) {

                int i3 = i2 + 1;
                int i4 = nums.length - 1;
                while (i3 < i4) {
                    long sum = nums[i1] + nums[i2] + (long) nums[i3] + nums[i4];
                    if (sum <= Integer.MAX_VALUE && sum == target)
                        res.add(List.of(nums[i1], nums[i2], nums[i3++], nums[i4--]));
                    else if (nums[i1] + nums[i2] + nums[i3] + nums[i4] > target)
                        i4--;
                    else i3++;
                }
            }
        }

        return res.stream().toList();
    }
}
