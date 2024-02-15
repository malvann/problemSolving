package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidTriangleNumberTest {
    @ParameterizedTest
    @MethodSource
    void test(int[] nums, int result) {
        assertEquals(result, new ValidTriangleNumber().triangleNumber(nums));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{2,2,3,4}, 3),
                Arguments.of(new int[]{4,2,3,4}, 4)
        );
    }
}