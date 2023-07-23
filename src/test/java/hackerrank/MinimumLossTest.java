package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumLossTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Long> price, int result) {
        assertEquals(result, MinimumLoss.minimumLoss(price));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(20L, 15L, 8L, 2L, 12L)), 3),
                Arguments.of(new ArrayList<>(List.of(5L, 10L, 3L)), 2),
                Arguments.of(new ArrayList<>(List.of(20L, 7L, 8L, 2L, 5L)), 2)
        );
    }
}