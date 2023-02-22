package streams;

import java.util.stream.IntStream;

public class FindAllTheEvenNumbers {
    public Integer[] findAllTheEvenNumbers(int[] nums) {
        return IntStream.of(nums).boxed().filter(num -> (num & 1) == 0).toArray(Integer[]::new);
    }
}
