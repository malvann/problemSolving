package hackerrank;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;

public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        return unsorted.parallelStream()
                .sorted(Comparator.comparing(BigInteger::new))
                .toList();
    }
}
