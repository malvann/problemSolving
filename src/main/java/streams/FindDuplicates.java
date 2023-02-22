package streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class FindDuplicates {
    public Integer[] findDuplicates(int[] nums) {
        Set<Integer> nonDupls = new HashSet<>();
        return IntStream.of(nums).boxed().filter(num -> !nonDupls.add(num)).toArray(Integer[]::new);
    }
}
