package leetcode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueNumberIfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Long> collect = IntStream.of(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return collect.size() == collect.values().stream().distinct().count();
    }
}
