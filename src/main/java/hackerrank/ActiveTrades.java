package hackerrank;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ActiveTrades {
    public static List<String> mostActive(List<String> customers) {
        int fivePercents = (int) Math.ceil(customers.size() * 0.05);
        return new TreeMap<>(customers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())))
                .entrySet().stream().filter(e -> e.getValue() >= fivePercents)
                .map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
