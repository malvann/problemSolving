package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CutTheSticks {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Long> collect = arr.stream()
                .parallel()
                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()))
                .values().stream().toList();
        List<Integer> res = new ArrayList<>() {{
            add(arr.size());
        }};
        for (int i = 0; i < collect.size() - 1; i++) {
            res.add((int) (res.get(i) - collect.get(i)));
        }
        return res;
    }
}
