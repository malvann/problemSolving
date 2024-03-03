package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HalloweenPartyTest {
    @ParameterizedTest
    @MethodSource
    void test(int k, int result) {
        assertEquals(result, HalloweenParty.halloweenParty(k));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 6),
                Arguments.of(6, 9),
                Arguments.of(7, 12),
                Arguments.of(8, 16)
        );
    }
}