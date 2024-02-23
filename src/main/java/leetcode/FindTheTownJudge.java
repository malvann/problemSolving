package leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) return 1;

        Map<Integer, List<int[]>> collect = Stream.of(trust).parallel()
                .collect(Collectors.groupingBy(arr -> arr[1]));
        Optional<Map.Entry<Integer, List<int[]>>> first = collect.entrySet().stream().parallel()
                .filter(e -> e.getValue().size() == n - 1)
                .findFirst();
        return first.filter(integerListEntry -> collect.values().stream()
                        .parallel()
                        .flatMap(Collection::stream)
                        .noneMatch(num -> Objects.equals(num[0], integerListEntry.getKey())))
                .map(Map.Entry::getKey)
                .orElse(-1);
    }
}
