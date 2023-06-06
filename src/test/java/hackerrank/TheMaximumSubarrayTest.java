package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheMaximumSubarrayTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Integer> arr, List<Integer> result) {
        assertEquals(result, TheMaximumSubarray.maxSubarray(arr));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(List.of(-1, 2, 3, -4, 5, 10), List.of(16, 20)),
                Arguments.of(List.of(1, 2, 3, 4), List.of(10, 10)),
                Arguments.of(List.of(2, -1, 2, 3, 4, -5), List.of(10, 11)),
                Arguments.of(List.of(-2, -3, -1, -4, -6), List.of(-1, -1))
        );
    }
}