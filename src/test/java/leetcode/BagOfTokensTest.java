package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BagOfTokensTest {
    @ParameterizedTest
    @MethodSource
    void test(int[] tokens, int power, int result) {
        assertEquals(result, new BagOfTokens().bagOfTokensScore(tokens, power));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{90, 69, 47}, 10, 0),
                Arguments.of(new int[]{26}, 51, 1),
                Arguments.of(new int[]{100}, 50, 0),
                Arguments.of(new int[]{200, 100}, 150, 1),
                Arguments.of(new int[]{100, 200, 300, 400}, 200, 2)
        );
    }
}