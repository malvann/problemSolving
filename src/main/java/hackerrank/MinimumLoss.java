package hackerrank;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumLoss {
    public static int minimumLoss(List<Long> price) {
        long min = Long.MAX_VALUE;
        Map<Long, Integer> priceByYear = IntStream.range(0, price.size())
                .boxed()
                .collect(Collectors.toMap(
                        price::get,
                        Function.identity()
                ));

        price.sort(Long::compareTo);
        for (int i = 0; i < price.size() - 2; i++) {
            if (priceByYear.get(price.get(i + 1)) > priceByYear.get(price.get(i))) continue;
            if (price.get(i + 1).equals(price.get(i))) return 0;

            long delta = price.get(i + 1) - price.get(i);
            min = Math.min(min, delta);
        }
        return (int) min;
    }
}
