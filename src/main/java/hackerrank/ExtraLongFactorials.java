package hackerrank;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class ExtraLongFactorials {
    public static BigInteger extraLongFactorials(int n) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .boxed()
                .map(BigInteger::valueOf)
                .reduce(BigInteger::multiply).orElse(BigInteger.ONE);
    }
}
