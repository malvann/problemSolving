package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindPolygonWithTheLargestPerimeter {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = IntStream.of(nums).boxed()
                .map(Integer::toUnsignedLong)
                .parallel()
                .reduce(Long::sum)
                .orElse(-1L);
        for (int i = nums.length - 1; i > 1; i--) {
            if (sum - nums[i] > nums[i]) return sum;
            sum -= nums[i];
        }
        return -1;
    }
}
