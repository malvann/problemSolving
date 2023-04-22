package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReplaceElementsWithGreatestElementOnRightSideTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int[] result) {
        assertArrayEquals(result, new ReplaceElementsWithGreatestElementOnRightSide().replaceElements(nums));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{17, 18, 5, 4, 6, 1}, new int[]{18, 6, 6, 6, 1, -1})
        );
    }
}