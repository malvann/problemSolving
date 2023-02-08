package hackerrank;

import java.util.List;
import java.util.stream.Collectors;

public class EqualizeArray {
    public static int equalizeArray(List<Integer> arr) {
        long aLong = arr.stream().collect(Collectors.groupingBy(o -> o, Collectors.counting()))
                .values().stream().max(Long::compareTo).orElse(0L);
        return arr.size() - (int)aLong;
    }
}
