package streams;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOnlyDuplicates {
    public Map<String, Long> countOnlyDuplicates(List<String> strings) {
        return strings.stream()
                .filter(s -> Collections.frequency(strings, s) > 1)
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
    }
}
