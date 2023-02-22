package streams;

import java.util.stream.IntStream;

public class AreAllDistinct {
    public boolean areAllDistinct(int[] nums) {
        return IntStream.of(nums).boxed().distinct().count() - nums.length == 0;
    }
}
