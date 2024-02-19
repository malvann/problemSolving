package hackerrank;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        return arr.stream().parallel().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((o1, o2) ->
                        o1.getValue().equals(o2.getValue())
                                ? o1.getKey() - o2.getKey()
                                : Long.compare(o2.getValue(), o1.getValue()))
                .map(Map.Entry::getKey).findFirst().orElse(-1);
    }
}
