package streams;

import java.util.stream.IntStream;

public class FindNumbersStartedWithOne {
    public Integer[] findNumbersStartedWithOne(int[] nums) {
        return IntStream.of(nums).boxed().filter(num -> String.valueOf(num).startsWith("1")).toArray(Integer[]::new);
    }
}
