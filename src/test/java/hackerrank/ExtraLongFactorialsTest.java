package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtraLongFactorialsTest {
    @ParameterizedTest
    @MethodSource
    void test(int num, BigInteger result) {
        assertEquals(result, ExtraLongFactorials.extraLongFactorials(num));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(25, new BigInteger("15511210043330985984000000")),
                Arguments.of(1, new BigInteger("1")),
                Arguments.of(0, new BigInteger("1"))
        );
    }
}