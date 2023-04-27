package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllNumbersDisappearedInAnArrayTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] arr, List<Integer> result) {
        assertEquals(result, new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(arr));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6)),
                Arguments.of(new int[]{4, 3, 5, 7, 8, 2, 6, 1}, List.of()),
                Arguments.of(new int[]{1, 1}, List.of(2))
        );
    }
}