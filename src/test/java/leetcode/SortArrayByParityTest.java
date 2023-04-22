package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortArrayByParityTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int expectedNumOfEvens) {
        int[] ints = new SortArrayByParity().sortArrayByParity(nums);
        System.out.println(Arrays.toString(IntStream.of(ints).boxed().toArray()));
        assertTrue(
                IntStream.of(Arrays.copyOf(ints, expectedNumOfEvens))
                        .allMatch(value -> (value & 1) == 0));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 2, 4}, 2),
                Arguments.of(new int[]{3, 1, 2, 5, 6, 8}, 3),
                Arguments.of(new int[]{2, 2}, 2),
                Arguments.of(new int[]{1, 1}, 0),
                Arguments.of(new int[]{1, 0, 3, 5}, 0)
        );
    }
}