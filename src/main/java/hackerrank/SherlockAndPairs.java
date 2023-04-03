package hackerrank;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SherlockAndPairs {
    public static long solve(List<Integer> nums) {
        return nums.stream().parallel()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().filter(val -> val > 1)
                .map(val -> val * (val - 1))
                .reduce(Long::sum).orElse(0L);
    }
}
