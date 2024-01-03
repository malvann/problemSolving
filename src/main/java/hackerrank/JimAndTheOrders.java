package hackerrank;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class JimAndTheOrders {

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        return IntStream.range(1, orders.size() + 1)
                .mapToObj(i -> new Pair(i, orders.get(i - 1).stream().reduce(0, Integer::sum)))
                .sorted(Comparator.comparingInt(Pair::val).thenComparing(Pair::index))
                .map(pair -> pair.index)
                .toList();
    }

    record Pair (Integer index, Integer val) {}
}
