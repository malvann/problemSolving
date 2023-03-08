package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int result) {
        assertEquals(result, new SingleNumber().singleNumber(nums));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{2, 2, 1}, 1),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{4, 1, 2, 1, 2}, 4));
    }
}