package streams;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreAllDistinctTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, boolean result) {
        assertEquals(result, new AreAllDistinct().areAllDistinct(nums));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 3, 5, 1, 1, 7}, false),
                Arguments.of(new int[]{7, 1, 3, 5, 8, 10, 9}, true)
        );
    }
}